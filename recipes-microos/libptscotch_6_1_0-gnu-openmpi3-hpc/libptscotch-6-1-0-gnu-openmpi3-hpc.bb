SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch_6_1_0-gnu-openmpi3-hpc-6.1.0-2.7.aarch64.rpm"
RPM_HASH = "6d3f54935e9a8309f4250cf03227de0b38b859b43e936b5802ef2204ee7658b76e337238298809b7664018e7e1eee5246bcdc26317fe92873b58282bc3e265b8"

RPROVIDES:${PN} += "libptscotch_6_1_0-gnu-openmpi3-hpc \
libptscotch_6_1_0-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
gnu-compilers-hpc \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgfortran.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libopenmpi3-gnu-hpc \
libz.so.1()(64bit) \
lua-lmod"

inherit rpm
