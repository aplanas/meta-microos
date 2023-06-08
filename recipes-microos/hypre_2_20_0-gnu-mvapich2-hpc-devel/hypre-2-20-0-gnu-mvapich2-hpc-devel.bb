SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the mvapich2 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-mvapich2-hpc-devel-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "e943b1cdcebe624b212a876849b4f111f68562cc28e883aea96c4c2f56d52b9f40ec1e838c49b2e6ccd892977642ba5fc09156f7f4bfa5e1d0cf0fab31c56210"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-mvapich2-hpc-devel hypre_2_20_0-gnu-mvapich2-hpc-devel(aarch-64) pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHYPRE_2_20_0-gnu-mvapich2-hpc libc.so.6(GLIBC_2.17)(64bit) libopenblas-gnu-hpc-devel mvapich2-gnu-hpc-devel superlu-gnu-hpc-devel"

inherit rpm
