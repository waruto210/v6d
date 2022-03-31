// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.std.impl.vector;

import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import io.v6d.arrow.Field;
import io.v6d.std.allocator;
import io.v6d.std.impl.allocator.ConstPointerStdSharedPtrArrowField;
import io.v6d.std.impl.allocator.ConstReferenceStdSharedPtrArrowField;
import io.v6d.std.impl.allocator.PointerStdSharedPtrArrowField;
import io.v6d.std.impl.allocator.ReferenceStdSharedPtrArrowField;
import io.v6d.std.shared_ptr;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("std::vector<std::shared_ptr<arrow::Field>, std::allocator<std::shared_ptr<arrow::Field>>>::allocator_type")
@FFIGen
@CXXHead(
        system = "vector"
)
public interface AllocatorTypeStdSharedPtrArrowFieldStdAllocatorStdSharedPtrArrowField extends CXXPointer {
    @FFIExpr("{0}")
    allocator<shared_ptr<Field>> get();

    @FFITypeAlias("std::shared_ptr<arrow::Field>")
    shared_ptr<Field> allocate(long __n);

    void deallocate(@FFITypeAlias("std::shared_ptr<arrow::Field>") shared_ptr<Field> __p, long __n);

    @CXXValue
    PointerStdSharedPtrArrowField address(@CXXValue ReferenceStdSharedPtrArrowField __x);

    @CXXValue
    ConstPointerStdSharedPtrArrowField address(@CXXValue ConstReferenceStdSharedPtrArrowField __x);

    @FFITypeAlias("std::shared_ptr<arrow::Field>")
    shared_ptr<Field> allocate(long __n, @FFITypeAlias("const void*") long arg1);

    long max_size();

    void destroy(@CXXValue PointerStdSharedPtrArrowField __p);

    static AllocatorTypeStdSharedPtrArrowFieldStdAllocatorStdSharedPtrArrowField cast(
            final long __foreign_address) {
        try {
            Class<AllocatorTypeStdSharedPtrArrowFieldStdAllocatorStdSharedPtrArrowField> clz = (Class<AllocatorTypeStdSharedPtrArrowFieldStdAllocatorStdSharedPtrArrowField>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(AllocatorTypeStdSharedPtrArrowFieldStdAllocatorStdSharedPtrArrowField.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static AllocatorTypeStdSharedPtrArrowFieldStdAllocatorStdSharedPtrArrowField cast(
            final FFIPointer __foreign_pointer) {
        return AllocatorTypeStdSharedPtrArrowFieldStdAllocatorStdSharedPtrArrowField.cast(__foreign_pointer.getAddress());
    }
}