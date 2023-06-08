SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi2-hpc-devel-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "a6e52bb512c444e84cc32942c9b15957ea0f851d259669ad081d5161639b5995f4c472fd5f5b76610d77b3d5fbd9587ae786613f7766dfb10fffa5dbc8a5cc5b"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi2-hpc-devel hypre_2_20_0-gnu-openmpi2-hpc-devel(aarch-64) pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHYPRE_2_20_0-gnu-openmpi2-hpc libc.so.6(GLIBC_2.17)(64bit) libopenblas-gnu-hpc-devel openmpi2-gnu-hpc-devel superlu-gnu-hpc-devel"

inherit rpm
