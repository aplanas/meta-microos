SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi4-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "3bce4840479c24e3c81d09eb66ac84b3effd9a68cbe8bb7949cf78a263a9b2a00cca6e9013f8b99388173516ca80604c7d28b92d489aa1d4752fe31ca71a0e54"

RPROVIDES:${PN} += "libptesmumps.so.0()(64bit) libptscotch.so.0()(64bit) libptscotch0-openmpi4 libptscotch0-openmpi4(aarch-64) libptscotcherr.so.0()(64bit) libptscotcherrexit.so.0()(64bit) libptscotchparmetis.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpi.so.40()(64bit) libscotch0 libz.so.1()(64bit)"

inherit rpm
