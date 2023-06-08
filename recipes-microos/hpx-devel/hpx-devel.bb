SUMMARY = "Development headers and libraries for hpx"
DESCRIPTION = "HPX is a general purpose C++ runtime system for parallel and distributed applications of any scale. \
 \
This package contains development headers and libraries for hpx"
LICENSE = "BSL-1.0"

PV = "1.8.1"

RPM_NAME = "hpx-devel-1.8.1-2.2.aarch64.rpm"
RPM_HASH = "06f943d054a9b189cb5aface8eb0ec089333466d433210600ec957beb866017bb098bcb5271cd69161291f66cc6ffb161fed206bb44bb38e0ff68462c56a6ba1"

RPROVIDES:${PN} += "cmake(HPX) hpx-devel hpx-devel(aarch-64) libhpx_core.so()(64bit) pkgconfig(hpx_application_relwithdebinfo) pkgconfig(hpx_component_relwithdebinfo)"
RDEPENDS:${PN} += "/usr/bin/pkg-config /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libatomic.so.1()(64bit) libatomic.so.1(LIBATOMIC_1.0)(64bit) libboost_context.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libhpx1 libhwloc.so.15()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtcmalloc_minimal.so.4()(64bit) openmpi4-devel"

inherit rpm
