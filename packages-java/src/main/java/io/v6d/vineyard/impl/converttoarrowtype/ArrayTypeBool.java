// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.vineyard.impl.converttoarrowtype;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.arrow.ArrayData;
import io.v6d.arrow.BooleanArray;
import io.v6d.arrow.Buffer;
import io.v6d.std.shared_ptr;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("vineyard::ConvertToArrowType<bool>::ArrayType")
@FFIGen
@CXXHead("basic/ds/arrow_utils.h")
public interface ArrayTypeBool extends CXXPointer {
    @FFIExpr("{0}")
    BooleanArray get();

    boolean Value(long i);

    boolean GetView(long i);

    long false_count();

    long true_count();

    @CXXValue
    BooleanArray.IteratorType begin();

    @CXXValue
    BooleanArray.IteratorType end();

    static ArrayTypeBool cast(final long __foreign_address) {
        try {
            Class<ArrayTypeBool> clz = (Class<ArrayTypeBool>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(ArrayTypeBool.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static ArrayTypeBool cast(final FFIPointer __foreign_pointer) {
        return ArrayTypeBool.cast(__foreign_pointer.getAddress());
    }

    static Factory getFactory() {
        return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(ArrayTypeBool.class, true));
    }

    static ArrayTypeBool create(
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::ArrayData>") shared_ptr<ArrayData> data) {
        return ArrayTypeBool.getFactory().create(data);
    }

    static ArrayTypeBool create(long length,
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> data,
            @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> null_bitmap,
            long null_count, long offset) {
        return ArrayTypeBool.getFactory().create(length, data, null_bitmap, null_count, offset);
    }

    @FFIFactory
    @CXXHead("basic/ds/arrow_utils.h")
    interface Factory {
        ArrayTypeBool create(
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::ArrayData>") shared_ptr<ArrayData> data);

        ArrayTypeBool create(long length,
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> data,
                @CXXReference @FFITypeAlias("const std::shared_ptr<arrow::Buffer>") shared_ptr<Buffer> null_bitmap,
                long null_count, long offset);
    }
}