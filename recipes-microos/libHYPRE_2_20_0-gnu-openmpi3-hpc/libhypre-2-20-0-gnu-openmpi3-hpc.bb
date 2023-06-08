SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains openmpi3 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE_2_20_0-gnu-openmpi3-hpc-2.20.0-1.20.aarch64.rpm"
RPM_HASH = "2cd983c3b2ab315e33cfb50289b72f3aa18128f1b47c101b78f66238402b6ccb0bca2cce7bab792b5fe8a2753ac2edb76895c31030ae97e14dcffe389395f7be"

RPROVIDES:${PN} += "libHYPRE_2_20_0-gnu-openmpi3-hpc libHYPRE_2_20_0-gnu-openmpi3-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnu-compilers-hpc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libopenmpi3-gnu-hpc lua-lmod"

inherit rpm
