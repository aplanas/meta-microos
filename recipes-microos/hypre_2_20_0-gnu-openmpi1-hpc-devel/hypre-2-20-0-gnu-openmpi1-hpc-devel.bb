SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi1-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi1 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi1-hpc-devel-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "7d2923652143479a5dbd1e89e8812ad5d6f4dbf30974ce11e30fb6e5d09dd1b9563e26300ea03093d6cbd0eb70fdae296442d06603846f0bac41b4908a25ae38"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi1-hpc-devel hypre_2_20_0-gnu-openmpi1-hpc-devel(aarch-64) pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHYPRE_2_20_0-gnu-openmpi1-hpc libc.so.6(GLIBC_2.17)(64bit) libopenblas-gnu-hpc-devel openmpi1-gnu-hpc-devel superlu-gnu-hpc-devel"

inherit rpm
