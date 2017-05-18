package com.github.mai7.opencc.dict;

import java.util.List;

/**
 * Created by vincent on 2017/5/18.
 */
public class DictGroup extends Dict{

    private List<Dict> dicts;

    public DictGroup( List<Dict> dicts) {
        this.dicts = dicts;

    }
}
