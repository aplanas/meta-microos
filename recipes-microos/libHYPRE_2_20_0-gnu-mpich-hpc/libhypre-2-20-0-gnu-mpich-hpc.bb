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

RPM_NAME = "libHYPRE_2_20_0-gnu-mpich-hpc-2.20.0-1.23.aarch64.rpm"
RPM_HASH = "cc8730fc6fb134865e040f25a58186d699702d765ff6bed07b65807493bddc24278cd31450ff97a808419c682760de1fb420b3a20e90b441e61a34767093f804"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-mpich-hpc libHYPRE_2_20_0-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) lua-lmod mpich-gnu-hpc"

inherit rpm
