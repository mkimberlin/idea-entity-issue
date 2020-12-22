package com.objectcomputing.idea.entityissue;

public interface SimpleInterface {
    <S extends SimplePojo> S doSomething();

    <E extends EntityPojo> E doOtherthing();
}
