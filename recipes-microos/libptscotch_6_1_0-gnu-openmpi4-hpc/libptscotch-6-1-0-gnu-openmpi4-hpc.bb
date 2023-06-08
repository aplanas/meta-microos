SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi4-hpc-6.1.0-2.8.aarch64.rpm"
RPM_HASH = "f0ed795a3187d937acf251fdfa7e66b9392a2e25e062a06faef37b6090e0aaa22ef55f402f08f9527847bf9c6bf9f432c32e2597dc8dc7e2f2cf0d97431d789f"

RPROVIDES:${PN} += "libptscotch_6_1_0-gnu-openmpi4-hpc libptscotch_6_1_0-gnu-openmpi4-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libopenmpi4-gnu-hpc libz.so.1()(64bit) lua-lmod"

inherit rpm
