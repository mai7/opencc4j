package com.github.mai7.opencc.dict;

import java.util.Optional;

/**
 * Created by vincent on 2017/5/17.
 */
public class Dict {

    public Optional<DictEntry> match(final char[] word) {
        //FIXME
        return Optional.empty();
    }

    public Optional<DictEntry> match(String word) {

        return this.match( word.toCharArray());
    }

    public Optional<DictEntry> matchPrefix( final char[] word ) {
        //FIXME
        return Optional.empty();

    }

    public Optional<DictEntry> matchPrefix(final String word) {

        return this.matchPrefix( word.toCharArray() );
    }

    public Optional<DictEntry> matchAllPrefixes ( final char[] word ) {

        return Optional.empty();
    }

    public Optional<DictEntry> matchAllPrefixes ( final String word ) {

        return this.matchAllPrefixes( word.toCharArray() );
    }

    public int keyMaxLength() {
        //FIXME
        return 0;
    }

    Lexicon getLexicon() {
        //FIXME
        return null;
    }
}
