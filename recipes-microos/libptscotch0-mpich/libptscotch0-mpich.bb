SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-mpich-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "22b7bd8a62505e316ed7948719eba2c1e2aefcde942fe2543a80e5f03997cc52b5963a5604e612416cbda6aecea3678087c32828ff0a279cf593e56a979916d3"

RPROVIDES:${PN} += "libptesmumps.so.0()(64bit) libptscotch.so.0()(64bit) libptscotch0-mpich libptscotch0-mpich(aarch-64) libptscotcherr.so.0()(64bit) libptscotcherrexit.so.0()(64bit) libptscotchparmetis.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpi.so.12()(64bit) libscotch0 libz.so.1()(64bit)"

inherit rpm
