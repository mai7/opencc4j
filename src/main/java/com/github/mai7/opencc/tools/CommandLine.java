package com.github.mai7.opencc.tools;

import org.kohsuke.args4j.*;

/**
 * Created by vincent on 2017/5/16.
 */
public class CommandLine {

    @Option(name="c", aliases = {"config"}, usage = "Configuration File")
    private String configFile = "st2json";

    @Option(name="o", aliases = {"output"}, usage = "Write converted text to <file>.")
    private String outputArg = "";

    @Option(name="i", aliases = {"input"}, usage = "Read original text from <file>.")
    private String inputArg = "";


    @Option(name="", aliases = {"noflush"}, usage = "Disable flush for every line")
    private boolean noFlushArg = false;


    public static void main( String[] args ) {

        ParserProperties parserProperties = ParserProperties.defaults();
        parserProperties.withUsageWidth(80);
        CmdLineParser cmdLineParser = new CmdLineParser(new CommandLine(), parserProperties);

        System.out.println("Open Chinese Convert (OpenCC) Command Line Tool");
        try {
            if ( args.length == 0 ) {
                System.out.println("Usage:");
                cmdLineParser.printUsage(System.out);
            }
            cmdLineParser.parseArgument(args);
            //FIXME
        } catch (CmdLineException e) {
            e.printStackTrace();
            cmdLineParser.printUsage(System.err);

        }

    }
}
