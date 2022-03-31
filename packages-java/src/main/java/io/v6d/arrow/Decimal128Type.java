// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.arrow;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFINameAlias;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.std.CChar;
import io.v6d.std.shared_ptr;
import io.v6d.std.string;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("arrow::Decimal128Type")
@FFIGen
@CXXHead(
        system = "arrow/type.h"
)
public interface Decimal128Type extends DecimalType, FFIPointer {
    @CXXValue
    @FFINameAlias("ToString")
    string ToString_1();

    @CXXValue
    @FFINameAlias("name")
    string name_1();

    static Decimal128Type cast(final long __foreign_address) {
        try {
            Class<Decimal128Type> clz = (Class<Decimal128Type>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(Decimal128Type.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static Decimal128Type cast(final FFIPointer __foreign_pointer) {
        return Decimal128Type.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(Decimal128Type.class, true));
    }

    static Decimal128Type create(int precision, int scale) {
        return Decimal128Type.getFactory().create(precision, scale);
    }

    @FFIFactory
    @CXXHead(
            system = "arrow/type.h"
    )
    interface Factory {
        Decimal128Type create(int precision, int scale);
    }

    @FFIGen
    @FFILibrary(
            value = "arrow::Decimal128Type",
            namespace = "arrow::Decimal128Type"
    )
    @CXXHead(
            system = "arrow/type.h"
    )
    interface Library {
        Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

        @FFINameAlias("type_name")
        CChar type_name_1();

        @CXXValue
        @FFITypeAlias("arrow::Result<std::shared_ptr<arrow::DataType>>")
        Result<shared_ptr<DataType>> Make(int precision, int scale);
    }
}