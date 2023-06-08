SUMMARY = "A C++ utility library"
DESCRIPTION = "This contains the shared libraries for folly, a C++ utility library developed \
at Facebook."
LICENSE = "MIT"

PV = "2023.05.01.00"

RPM_NAME = "libfolly-v2023_05_01_00-2023.05.01.00-1.1.aarch64.rpm"
RPM_HASH = "a4b994f5698daf13becce2076b712759022dc3d1af97fe04d6805b7fdd3346385e26235f4b60386180e4fcd59a3a66bbadd734fd9f5685bbdaf4a20df6432536"

RPROVIDES:${PN} += "libfolly-v2023_05_01_00 libfolly-v2023_05_01_00(aarch-64) libfolly.so.v2023.05.01.00()(64bit) libfolly_exception_counter.so.v2023.05.01.00()(64bit) libfolly_exception_tracer.so.v2023.05.01.00()(64bit) libfolly_exception_tracer_base.so.v2023.05.01.00()(64bit) libfolly_test_util.so.v2023.05.01.00()(64bit) libfollybenchmark.so.v2023.05.01.00()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libboost_context.so.1.82.0()(64bit) libboost_filesystem.so.1.82.0()(64bit) libboost_program_options.so.1.82.0()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdouble-conversion.so.3()(64bit) libevent-2.1.so.7()(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgflags.so.2.2()(64bit) libglog.so.0()(64bit) liblz4.so.1()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsnappy.so.1()(64bit) libsodium.so.23()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libunwind.so.8()(64bit) liburing.so.2()(64bit) liburing.so.2(LIBURING_2.0)(64bit) liburing.so.2(LIBURING_2.2)(64bit) liburing.so.2(LIBURING_2.3)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit)"

inherit rpm
