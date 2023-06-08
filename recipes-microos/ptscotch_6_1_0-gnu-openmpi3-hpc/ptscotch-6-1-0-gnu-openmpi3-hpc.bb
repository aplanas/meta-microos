SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch_6_1_0-gnu-openmpi3-hpc-6.1.0-2.7.aarch64.rpm"
RPM_HASH = "5d008b437648fbd63be900e46106c478e5aa1b653c0990b10fb1941bfda9e34a8ccf0b5756c95ce2393111727eb5655ea2aa19699f6a5c69a0075f7fcc319818"

RPROVIDES:${PN} += "ptscotch_6_1_0-gnu-openmpi3-hpc ptscotch_6_1_0-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libptscotch_6_1_0-gnu-openmpi3-hpc libz.so.1()(64bit)"

inherit rpm
