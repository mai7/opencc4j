package com.github.mai7.opencc.dict;

import java.util.Optional;

/**
 * Abstract class of dictionary
 */
public class Dict {


    /**
     * Matches a word exactly and returns the DictEntry or Optional::empty().
     */
    public Optional<DictEntry> match(final char[] word) {
        //FIXME
        return Optional.empty();
    }

    /**
     * Matches a word exactly and returns the DictEntry or Optional::empty().
     */
    public Optional<DictEntry> match(String word) {

        return this.match( word.toCharArray());
    }

    /**
     * Matches the longest matched prefix of a word.
     * For example given a dictionary having "a", "an", "b", "ba", "ban", "bana",
     * the longest prefix of "banana" matched is "bana".
     */
    public Optional<DictEntry> matchPrefix( final char[] word ) {
        //FIXME
        return Optional.empty();

    }


    /**
     * Matches the longest matched prefix of a word.
     */
    public Optional<DictEntry> matchPrefix(final String word) {

        return this.matchPrefix( word.toCharArray() );
    }


    /**
     * Returns all matched prefixes of a word, sorted by the length (desc).
     * For example given a dictionary having "a", "an", "b", "ba", "ban", "bana",
     * all the matched prefixes of "banana" are "bana", "ban", "ba", "b".
     */
    public Optional<DictEntry> matchAllPrefixes ( final char[] word ) {

        return Optional.empty();
    }

    /**
     * Returns all matched prefixes of a word, sorted by the length (desc).
     * @param word
     * @return
     */
    public Optional<DictEntry> matchAllPrefixes ( final String word ) {

        return this.matchAllPrefixes( word.toCharArray() );
    }

    /**
     * Returns the length of the longest key in the dictionary.
     * @return
     */
    public int keyMaxLength() {
        //FIXME
        return 0;
    }

    /**
     * Returns all entries in the dictionary.
     * @return
     */
    public Lexicon getLexicon() {
        //FIXME
        return null;
    }
}
