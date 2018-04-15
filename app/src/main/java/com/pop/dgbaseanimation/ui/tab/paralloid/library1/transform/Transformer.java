package com.pop.dgbaseanimation.ui.tab.paralloid.library1.transform;

/**
 * Created by chris on 23/10/2013
 * Project: Paralloid
 */
public interface Transformer {

    /**
     * @return can not be null, otherwise scroll will fail
     */
    int[] scroll(float x, float y, float factor);

}
