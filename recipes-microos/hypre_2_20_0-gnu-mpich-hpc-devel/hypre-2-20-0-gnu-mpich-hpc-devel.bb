SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mpich version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mpich-hpc-devel-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "b3240db84e51f7ad94b7f96e1ed668bf455eb953dbdef1ddfa1f8b06f425c67ec57dbad18e8af90501f65a28ad3a976da02e23e4b3d294a932e6610d0991d930"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-mpich-hpc-devel hypre_2_20_0-gnu-mpich-hpc-devel(aarch-64) pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHYPRE_2_20_0-gnu-mpich-hpc libc.so.6(GLIBC_2.17)(64bit) libopenblas-gnu-hpc-devel mpich-gnu-hpc-devel superlu-gnu-hpc-devel"

inherit rpm
