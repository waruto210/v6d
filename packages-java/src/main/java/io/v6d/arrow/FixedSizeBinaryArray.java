// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.arrow;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.arrow.stl.ArrayIterator;
import io.v6d.std.CChar;
import io.v6d.std.CUnsignedChar;
import io.v6d.std.shared_ptr;
import io.v6d.std.string;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("arrow::FixedSizeBinaryArray")
@FFIGen
@CXXHead(
        system = "arrow/array/array_binary.h"
)
public interface FixedSizeBinaryArray extends PrimitiveArray, FFIPointer {
    CUnsignedChar GetValue(long i);

    CUnsignedChar Value(long i);

    @CXXValue
    string GetString(long i);

    int byte_width();

    CUnsignedChar raw_values();

    @CXXValue
    IteratorType begin();

    @CXXValue
    IteratorType end();

    static FixedSizeBinaryArray cast(final long __foreign_address) {
        try {
            Class<FixedSizeBinaryArray> clz = (Class<FixedSizeBinaryArray>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(FixedSizeBinaryArray.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static FixedSizeBinaryArray cast(final FFIPointer __foreign_pointer) {
        return FixedSizeBinaryArray.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(FixedSizeBinaryArray.class, true));
    }

    static FixedSizeBinaryArray create(
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::ArrayData>") shared_ptr<ArrayData> data) {
        return FixedSizeBinaryArray.getFactory().create(data);
    }

    static FixedSizeBinaryArray create(
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::DataType>") shared_ptr<DataType> type,
            long length,
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> data,
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> null_bitmap,
            long null_count, long offset) {
        return FixedSizeBinaryArray.getFactory().create(type, length, data, null_bitmap, null_count, offset);
    }

    @FFIFactory
    @CXXHead(
            system = "arrow/array/array_binary.h"
    )
    interface Factory {
        FixedSizeBinaryArray create(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::ArrayData>") shared_ptr<ArrayData> data);

        FixedSizeBinaryArray create(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::DataType>") shared_ptr<DataType> type,
                long length,
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> data,
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> null_bitmap,
                long null_count, long offset);
    }

    @FFITypeAlias("arrow::FixedSizeBinaryArray::TypeClass")
    @FFIGen
    @CXXHead(
            system = "arrow/array/array_binary.h"
    )
    interface TypeClass extends CXXPointer {
        @FFIExpr("{0}")
        FixedSizeBinaryType get();

        @CXXValue
        string ToString();

        @CXXValue
        string name();

        @CXXValue
        DataTypeLayout layout();

        int byte_width();

        int bit_width();

        static TypeClass cast(final long __foreign_address) {
            try {
                Class<TypeClass> clz = (Class<TypeClass>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(TypeClass.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static TypeClass cast(final FFIPointer __foreign_pointer) {
            return TypeClass.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(TypeClass.class, true));
        }

        static TypeClass create(int byte_width) {
            return TypeClass.getFactory().create(byte_width);
        }

        static TypeClass create(int byte_width,
                @CXXValue @FFITypeAlias("arrow::Type::type") Type.type override_type_id) {
            return TypeClass.getFactory().create(byte_width, override_type_id);
        }

        @FFIFactory
        @CXXHead(
                system = "arrow/array/array_binary.h"
        )
        interface Factory {
            TypeClass create(int byte_width);

            TypeClass create(int byte_width,
                    @CXXValue @FFITypeAlias("arrow::Type::type") Type.type override_type_id);
        }

        @FFIGen
        @FFILibrary(
                value = "arrow::FixedSizeBinaryType",
                namespace = "arrow::FixedSizeBinaryType"
        )
        @CXXHead(
                system = "arrow/array/array_binary.h"
        )
        interface Library {
            Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

            CChar type_name();

            @CXXValue
            @FFITypeAlias("arrow::Result<std::shared_ptr<arrow::DataType>>")
            Result<shared_ptr<DataType>> Make(int byte_width);
        }
    }

    @FFITypeAlias("arrow::FixedSizeBinaryArray::IteratorType")
    @FFIGen
    @CXXHead(
            system = "arrow/array/array_binary.h"
    )
    interface IteratorType extends CXXPointer {
        @FFIExpr("{0}")
        ArrayIterator<FixedSizeBinaryArray> get();

        long index();

        static IteratorType cast(final long __foreign_address) {
            try {
                Class<IteratorType> clz = (Class<IteratorType>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(IteratorType.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static IteratorType cast(final FFIPointer __foreign_pointer) {
            return IteratorType.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(IteratorType.class, true));
        }

        static IteratorType create() {
            return IteratorType.getFactory().create();
        }

        static IteratorType create(@CXXReference FixedSizeBinaryArray array, long index) {
            return IteratorType.getFactory().create(array, index);
        }

        @FFIFactory
        @CXXHead(
                system = "arrow/array/array_binary.h"
        )
        interface Factory {
            IteratorType create();

            IteratorType create(@CXXReference FixedSizeBinaryArray array, long index);
        }
    }
}