// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.std;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("std::random_access_iterator_tag")
@FFIGen
@CXXHead(
        system = "__iterator/iterator_traits.h"
)
public interface random_access_iterator_tag extends bidirectional_iterator_tag, FFIPointer {
    static random_access_iterator_tag cast(final long __foreign_address) {
        try {
            Class<random_access_iterator_tag> clz = (Class<random_access_iterator_tag>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(random_access_iterator_tag.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static random_access_iterator_tag cast(final FFIPointer __foreign_pointer) {
        return random_access_iterator_tag.cast(__foreign_pointer.getAddress());
    }
}