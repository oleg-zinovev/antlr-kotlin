/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package org.antlr.v4.kotlinruntime.atn.states

class StarLoopbackState : ATNState() {
    val loopEntryState: StarLoopEntryState
        get() = transition(0).target as StarLoopEntryState

    override val stateType: Int
        get() = STAR_LOOP_BACK
}