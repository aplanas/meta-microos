SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi4 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi4-hpc-devel-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "c0ca932fd6a1782790183bfec5d74768fcde4efddb834ac0d8b52141295cc5e64d2531288512dcabf2f0cec96b0810a4b0fa90b161029ce85a4dfb6d7d1d9566"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi4-hpc-devel hypre_2_20_0-gnu-openmpi4-hpc-devel(aarch-64) pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHYPRE_2_20_0-gnu-openmpi4-hpc libc.so.6(GLIBC_2.17)(64bit) libopenblas-gnu-hpc-devel openmpi4-gnu-hpc-devel superlu-gnu-hpc-devel"

inherit rpm
