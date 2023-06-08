SUMMARY = "Automatic 3D tetrahedral mesh generator"
DESCRIPTION = "NETGEN is an automatic 3D tetrahedral mesh generator. It accepts \
input from constructive solid geometry (CSG) or boundary \
representation (BRep) from STL file format. The connection to a \
geometry kernel allows the handling of IGES and STEP files. NETGEN \
contains modules for mesh optimization and hierarchical mesh \
refinement."
LICENSE = "LGPL-2.1-only"

PV = "6.2.2301"

RPM_NAME = "netgen-6.2.2301-1.4.aarch64.rpm"
RPM_HASH = "302ed32f1d25183d47cbed1839f8622181a6f47b927453e88421227c8cd47ef5fcd12a12a4a706a532cdb65a828fa75808b56c95c5fe2318a3a670ab62994b2c"

RPROVIDES:${PN} += "netgen netgen(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libngcore.so()(64bit) libnggui.so()(64bit) libnglib.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtcl8.6.so()(64bit) libtk8.6.so()(64bit)"

inherit rpm
