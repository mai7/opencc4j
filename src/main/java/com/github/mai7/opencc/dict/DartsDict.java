package com.github.mai7.opencc.dict;

import java.io.File;
import java.util.Optional;

/**
 * Created by vincent on 2017/5/17.
 */
public abstract class DartsDict {

    public abstract int keyMaxLength();

    public abstract Optional<DictEntry> match(char[] word);

    public abstract Optional<DictEntry> matchPrefix(char[] words);

    public abstract Lexicon getLexicon();

    public abstract void serializeToFile();

    public abstract DartsDict NewFromDict(Dict input);

    public abstract DartsDict newFromFile(File in);

}
