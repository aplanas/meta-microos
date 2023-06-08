SUMMARY = "Libraries for the hpx package"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains libraries for the hpx package."
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "libhpx1-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "d785f3893297eaaa9da7a590e63e798aedd2f7fb1a6260a03809514c69fc54981f0b6fae6f68b9e4f96d15476727c418b1fca30b09cfcc5d4d87551afb1a8de4"

RPROVIDES:${PN} += "libhpx.so.1()(64bit) libhpx1 libhpx1(aarch-64) libhpx_component_storage.so.1()(64bit) libhpx_io_counters.so.1()(64bit) libhpx_iostreams.so.1()(64bit) libhpx_memory.so.1()(64bit) libhpx_parcel_coalescing.so.1()(64bit) libhpx_partitioned_vector.so.1()(64bit) libhpx_process.so.1()(64bit) libhpx_unordered.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libhpx_core.so()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtcmalloc_minimal.so.4()(64bit) openmpi4-libs"

inherit rpm
