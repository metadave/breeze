package com.metadave.breeze.render;

import com.metadave.breeze.ast.*;

public class BreezeSTRender implements BreezeASTVisitor {
    @Override
    public void visit(BreezeASD asd)  throws Exception{
        System.out.println("ASD");
    }

    @Override
    public void visit(BreezeConstructor ctor)  throws Exception{
        System.out.println("ctor:" + ctor.getId());
    }

    @Override
    public void visit(BreezeDefinition def)  throws Exception{

    }

    @Override
    public void visit(BreezeField field)  throws Exception{

    }

    @Override
    public void visit(BreezeFields fields)  throws Exception{

    }

    @Override
    public void visit(BreezeProductType pt)  throws Exception{

    }

    @Override
    public void visit(BreezeSumType st)  throws Exception{

    }

}
