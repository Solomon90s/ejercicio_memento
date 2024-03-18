package com.kreitek.editor.commands;

import com.kreitek.editor.Command;

import java.util.ArrayList;

public class UndoCommand implements Command {

    private final int lineNumber;

    public UndoCommand(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    @Override
    public void execute(ArrayList<String> documentLines) {


    }
}
