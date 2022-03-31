// Code generated by alibaba/fastFFI. DO NOT EDIT.
//
package io.v6d.std;

import com.alibaba.fastffi.CXXEnum;
import com.alibaba.fastffi.CXXEnumMap;
import com.alibaba.fastffi.CXXHead;
import com.alibaba.fastffi.CXXPointer;
import com.alibaba.fastffi.CXXReference;
import com.alibaba.fastffi.CXXValue;
import com.alibaba.fastffi.FFIExpr;
import com.alibaba.fastffi.FFIFactory;
import com.alibaba.fastffi.FFIGen;
import com.alibaba.fastffi.FFIGetter;
import com.alibaba.fastffi.FFILibrary;
import com.alibaba.fastffi.FFIPointer;
import com.alibaba.fastffi.FFITypeAlias;
import com.alibaba.fastffi.FFITypeFactory;
import com.alibaba.fastffi.FFITypeRefiner;
import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.InstantiationException;
import java.lang.Long;
import java.lang.NoSuchMethodException;
import java.lang.reflect.InvocationTargetException;

@FFITypeAlias("std::ios_base")
@FFIGen
@CXXHead(
        system = "ios"
)
public interface ios_base extends CXXPointer {
    int flags();

    int flags(int __fmtfl);

    int setf(int __fmtfl);

    int setf(int __fmtfl, int __mask);

    void unsetf(int __mask);

    long precision();

    long precision(long __prec);

    long width();

    long width(long __wide);

    @CXXValue
    locale imbue(@CXXReference locale __loc);

    @CXXValue
    locale getloc();

    @CXXReference
    CLong iword(int __index);

    @CXXReference
    CVoid pword(int __index);

    void register_callback(@CXXValue event_callback __fn, int __index);

    int rdstate();

    void clear(int __state);

    void setstate(int __state);

    boolean good();

    boolean eof();

    boolean fail();

    boolean bad();

    int exceptions();

    void exceptions(int __iostate);

    void __set_badbit_and_consider_rethrow();

    void __set_failbit_and_consider_rethrow();

    void __setstate_nothrow(int __state);

    static ios_base cast(final long __foreign_address) {
        try {
            Class<ios_base> clz = (Class<ios_base>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(ios_base.class, true));
            return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            return null;
        }
    }

    static ios_base cast(final FFIPointer __foreign_pointer) {
        return ios_base.cast(__foreign_pointer.getAddress());
    }

    @FFIGen
    @FFILibrary(
            value = "std::ios_base",
            namespace = "std::ios_base"
    )
    @CXXHead(
            system = "ios"
    )
    interface Library {
        Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

        int xalloc();

        boolean sync_with_stdio(boolean __sync);
    }

    @FFITypeAlias("std::ios_base::streamoff")
    @FFIGen
    @CXXHead(
            system = "ios"
    )
    interface streamoff extends CXXPointer {
        @FFIExpr("{0}")
        io.v6d.std.streamoff get();

        static streamoff cast(final long __foreign_address) {
            try {
                Class<streamoff> clz = (Class<streamoff>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(streamoff.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static streamoff cast(final FFIPointer __foreign_pointer) {
            return streamoff.cast(__foreign_pointer.getAddress());
        }
    }

    @FFITypeAlias("std::ios_base::openmode")
    @FFIGen
    interface openmode extends CXXPointer {
        @FFIExpr("(*{0})")
        int get();

        @FFIExpr("*{0} = (std::ios_base::openmode){1}")
        void set(int __value);

        static openmode cast(final long __foreign_address) {
            try {
                Class<openmode> clz = (Class<openmode>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(openmode.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static openmode cast(final FFIPointer __foreign_pointer) {
            return openmode.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(openmode.class, true));
        }

        static openmode create() {
            return openmode.getFactory().create();
        }

        static openmode create(int __value) {
            return openmode.getFactory().create(__value);
        }

        @FFIFactory
        interface Factory {
            openmode create();

            openmode create(int __value);
        }
    }

    @FFITypeAlias("std::ios_base::seek_dir")
    @FFIGen
    @CXXHead(
            system = "ios"
    )
    interface seek_dir extends CXXPointer {
        @FFIExpr("(*{0})")
        seekdir get();

        @FFIExpr("*{0} = (std::ios_base::seek_dir){1}")
        void set(seekdir __value);

        static seek_dir cast(final long __foreign_address) {
            try {
                Class<seek_dir> clz = (Class<seek_dir>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(seek_dir.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static seek_dir cast(final FFIPointer __foreign_pointer) {
            return seek_dir.cast(__foreign_pointer.getAddress());
        }
    }

    @FFITypeAlias("std::ios_base::io_state")
    @FFIGen
    interface io_state extends CXXPointer {
        @FFIExpr("(*{0})")
        int get();

        @FFIExpr("*{0} = (std::ios_base::io_state){1}")
        void set(int __value);

        static io_state cast(final long __foreign_address) {
            try {
                Class<io_state> clz = (Class<io_state>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(io_state.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static io_state cast(final FFIPointer __foreign_pointer) {
            return io_state.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(io_state.class, true));
        }

        static io_state create() {
            return io_state.getFactory().create();
        }

        static io_state create(int __value) {
            return io_state.getFactory().create(__value);
        }

        @FFIFactory
        interface Factory {
            io_state create();

            io_state create(int __value);
        }
    }

    @FFITypeAlias("std::ios_base::seekdir")
    @FFITypeRefiner("io.v6d.std.ios_base.seekdir.get")
    @CXXHead(
            system = "ios"
    )
    enum seekdir implements CXXEnum {
        beg(Library.INSTANCE.beg()),

        cur(Library.INSTANCE.cur()),

        end(Library.INSTANCE.end());

        private static final CXXEnumMap<seekdir> $map = new CXXEnumMap<>(values());

        int $value;

        seekdir(int value) {
            $value = value;
        }

        seekdir(CInt value) {
            $value = value.get();
        }

        public static seekdir get(int value) {
            return $map.get(value);
        }

        public static seekdir get(CInt value) {
            return $map.get(value.get());
        }

        public int getValue() {
            return $value;
        }

        public static seekdir cast(final long __foreign_address) {
            try {
                Class<seekdir> clz = (Class<seekdir>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(seekdir.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        public static seekdir cast(final FFIPointer __foreign_pointer) {
            return seekdir.cast(__foreign_pointer.getAddress());
        }

        @FFIGen
        @FFILibrary(
                value = "std::ios_base::seekdir",
                namespace = "std::ios_base::seekdir"
        )
        @CXXHead(
                system = "ios"
        )
        public interface Library {
            Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

            @FFIGetter
            int beg();

            @FFIGetter
            int cur();

            @FFIGetter
            int end();
        }
    }

    @FFITypeAlias("std::ios_base::open_mode")
    @FFIGen
    interface open_mode extends CXXPointer {
        @FFIExpr("(*{0})")
        int get();

        @FFIExpr("*{0} = (std::ios_base::open_mode){1}")
        void set(int __value);

        static open_mode cast(final long __foreign_address) {
            try {
                Class<open_mode> clz = (Class<open_mode>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(open_mode.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static open_mode cast(final FFIPointer __foreign_pointer) {
            return open_mode.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(open_mode.class, true));
        }

        static open_mode create() {
            return open_mode.getFactory().create();
        }

        static open_mode create(int __value) {
            return open_mode.getFactory().create(__value);
        }

        @FFIFactory
        interface Factory {
            open_mode create();

            open_mode create(int __value);
        }
    }

    @FFITypeAlias("std::ios_base::streampos")
    @FFIGen
    @CXXHead(
            system = "ios"
    )
    interface streampos extends CXXPointer {
        static streampos cast(final long __foreign_address) {
            try {
                Class<streampos> clz = (Class<streampos>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(streampos.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static streampos cast(final FFIPointer __foreign_pointer) {
            return streampos.cast(__foreign_pointer.getAddress());
        }
    }

    @FFITypeAlias("std::ios_base::event_callback")
    @FFIGen
    @CXXHead(
            system = "ios"
    )
    interface event_callback extends CXXPointer {
        static event_callback cast(final long __foreign_address) {
            try {
                Class<event_callback> clz = (Class<event_callback>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(event_callback.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static event_callback cast(final FFIPointer __foreign_pointer) {
            return event_callback.cast(__foreign_pointer.getAddress());
        }
    }

    @FFITypeAlias("std::ios_base::event")
    @FFITypeRefiner("io.v6d.std.ios_base.event.get")
    @CXXHead(
            system = "ios"
    )
    enum event implements CXXEnum {
        erase_event(Library.INSTANCE.erase_event()),

        imbue_event(Library.INSTANCE.imbue_event()),

        copyfmt_event(Library.INSTANCE.copyfmt_event());

        private static final CXXEnumMap<event> $map = new CXXEnumMap<>(values());

        int $value;

        event(int value) {
            $value = value;
        }

        event(CInt value) {
            $value = value.get();
        }

        public static event get(int value) {
            return $map.get(value);
        }

        public static event get(CInt value) {
            return $map.get(value.get());
        }

        public int getValue() {
            return $value;
        }

        public static event cast(final long __foreign_address) {
            try {
                Class<event> clz = (Class<event>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(event.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        public static event cast(final FFIPointer __foreign_pointer) {
            return event.cast(__foreign_pointer.getAddress());
        }

        @FFIGen
        @FFILibrary(
                value = "std::ios_base::event",
                namespace = "std::ios_base::event"
        )
        @CXXHead(
                system = "ios"
        )
        public interface Library {
            Library INSTANCE = FFITypeFactory.getLibrary(Library.class);

            @FFIGetter
            int erase_event();

            @FFIGetter
            int imbue_event();

            @FFIGetter
            int copyfmt_event();
        }
    }

    @FFITypeAlias("std::ios_base::iostate")
    @FFIGen
    interface iostate extends CXXPointer {
        @FFIExpr("(*{0})")
        int get();

        @FFIExpr("*{0} = (std::ios_base::iostate){1}")
        void set(int __value);

        static iostate cast(final long __foreign_address) {
            try {
                Class<iostate> clz = (Class<iostate>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(iostate.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static iostate cast(final FFIPointer __foreign_pointer) {
            return iostate.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(iostate.class, true));
        }

        static iostate create() {
            return iostate.getFactory().create();
        }

        static iostate create(int __value) {
            return iostate.getFactory().create(__value);
        }

        @FFIFactory
        interface Factory {
            iostate create();

            iostate create(int __value);
        }
    }

    @FFITypeAlias("std::ios_base::fmtflags")
    @FFIGen
    interface fmtflags extends CXXPointer {
        @FFIExpr("(*{0})")
        int get();

        @FFIExpr("*{0} = (std::ios_base::fmtflags){1}")
        void set(int __value);

        static fmtflags cast(final long __foreign_address) {
            try {
                Class<fmtflags> clz = (Class<fmtflags>) FFITypeFactory.getType(FFITypeFactory.getFFITypeName(fmtflags.class, true));
                return clz.getConstructor(Long.TYPE).newInstance(__foreign_address);
            } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
                return null;
            }
        }

        static fmtflags cast(final FFIPointer __foreign_pointer) {
            return fmtflags.cast(__foreign_pointer.getAddress());
        }

        static Factory getFactory() {
            return FFITypeFactory.getFactory(FFITypeFactory.getFFITypeName(fmtflags.class, true));
        }

        static fmtflags create() {
            return fmtflags.getFactory().create();
        }

        static fmtflags create(int __value) {
            return fmtflags.getFactory().create(__value);
        }

        @FFIFactory
        interface Factory {
            fmtflags create();

            fmtflags create(int __value);
        }
    }
}