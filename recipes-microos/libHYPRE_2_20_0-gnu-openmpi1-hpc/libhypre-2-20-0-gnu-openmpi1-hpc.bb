SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi1 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi1-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "5c6be57e3596841fdcf0b741543f6a7178a485095f2d72deb9f731f3b9600813fab59636b8211c41c1bed5feba3e468d298ca6160ce653a7eceb3975aca89a1c"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-openmpi1-hpc libHYPRE_2_20_0-gnu-openmpi1-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libopenmpi1-gnu-hpc lua-lmod"

inherit rpm
