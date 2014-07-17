/*
 * Copyright 2014 Pivotal Software, Inc. All Rights Reserved.
 */

package com.gopivotal.chaoslemur;

import org.junit.Test;

public class DestroyerTest {

    private final Destroyer destroyer = new Destroyer("0/11 * * * * *");

    @Test
    public void destroyTest() {
        this.destroyer.destroy();
    }

}