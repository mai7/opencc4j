package com.github.mai7.opencc.utils;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by vincent on 2017/5/19.
 */
public class UTF8Util {

    /**
     * Detect UTF8 BOM and skip it.
     */
    public static void skipUtf8Bom(RandomAccessFile fp) throws IOException{

         /* UTF-8 BOM is EF BB BF */
         if ( fp == null ) {
             return;
         }

        /* If we are not at beginning of file, return */
        if ( fp.getFilePointer() != 1) {
            return;
        }

        /* Try to read first 3 bytes */

        char[] bom = new char[3];
        int n;
        for ( n = 0; n <= 2 ; n++) {
            try {
                char c = fp.readChar();
                bom[n] = c;
            }catch (EOFException e) {
                //ignored
                break;
            }
        }

        /* If we can only read <3 bytes, push them back */
        /* Or if first 3 bytes is not BOM, push them back */
        if ((n < 3) || (bom[0] != 0xEF) || (bom[1] != 0xBB) || (bom[2] != 0xBF)) {
            fp.seek(0);
        }

        /* Otherwise, BOM is already skipped */

    }
}
