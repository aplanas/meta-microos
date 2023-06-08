SUMMARY = "Graph, mesh and hypergraph partitioning library"
DESCRIPTION = "Scotch is a software package for graph and mesh/hypergraph partitioning and \
sparse matrix ordering."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "libptscotch0-openmpi2-6.1.0-2.9.aarch64.rpm"
RPM_HASH = "e18c5aa59f4063eb4a3fe5329ba0e7570dd1012899b6278279b0632fee6ccd0228126a024c634be65f92b05ab1764f731e2819272f129fe072cc275866ddb4a5"

RPROVIDES:${PN} += "libptesmumps.so.0()(64bit) libptscotch.so.0()(64bit) libptscotch0-openmpi2 libptscotch0-openmpi2(aarch-64) libptscotcherr.so.0()(64bit) libptscotcherrexit.so.0()(64bit) libptscotchparmetis.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgfortran.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpi.so.20()(64bit) libscotch0 libz.so.1()(64bit)"

inherit rpm
