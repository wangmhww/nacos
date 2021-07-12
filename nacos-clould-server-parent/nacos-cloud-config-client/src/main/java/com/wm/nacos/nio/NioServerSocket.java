package com.wm.nacos.nio;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author: wangm
 * @date: 2021/7/2 9:20
 * @Description
 */
public class NioServerSocket {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel =  ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(9000));
        serverSocketChannel.configureBlocking(false);

        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("nio服务器启动");

        while (true) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            Iterator<SelectionKey> iterator = selectionKeys.iterator();
            if (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                if (selectionKey.isAcceptable()) {
                    serverSocketChannel = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel socketChannel = serverSocketChannel.accept();
                    socketChannel.configureBlocking(false);
                    System.out.println("建立连接");
                    socketChannel.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()) {
                    ByteBuffer byteBuffers = ByteBuffer.allocate(128);
                    SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                    int read = socketChannel.read(byteBuffers);
                    if (read > 0) {
                        System.out.println("接收到的数据：" + new String(byteBuffers.array(), 0, read) );
                    } else if (read == -1) {
                        System.out.println("断开连接");
                        socketChannel.close();
                    }
                }
            }
        }
    }

}
