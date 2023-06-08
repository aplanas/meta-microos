SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mpich shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-mpich-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "cc26d97b3be8a56d1b1509bcabf372ebcdb447f801d1e17339c540768403f4091626cf69a9be51260524e8c5d6d16c84bc6cef0bc8bb7f1c7c1da09c5976b5ad"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-mpich-hpc libHYPRE_2_20_0-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) lua-lmod mpich-gnu-hpc"

inherit rpm
