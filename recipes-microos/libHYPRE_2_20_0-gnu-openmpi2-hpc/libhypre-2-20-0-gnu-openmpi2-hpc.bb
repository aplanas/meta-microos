SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi2-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "4e628b876911ae9fc7870302c0c31a2936aab50d42c430d5630a33df58f5dad51eaa1fe0c7188b7c0ea1288cac4331c917750a7a1b1028f36ccfe662857f10b0"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-openmpi2-hpc libHYPRE_2_20_0-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libopenmpi2-gnu-hpc lua-lmod"

inherit rpm
