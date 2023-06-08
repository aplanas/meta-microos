SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi3-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi3 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi3-hpc-devel-2.20.0-1.20.aarch64.rpm"
RPM_HASH = "17f5e121bc6393c2298a8e2faf0df2e288d415b2a3f943a8b94dba7d9642491b26dec42ca689dc9948dce1411edef82cd0b0a672d92a46ea5df52794e27a3044"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi3-hpc-devel hypre_2_20_0-gnu-openmpi3-hpc-devel(aarch-64) pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHYPRE_2_20_0-gnu-openmpi3-hpc libc.so.6(GLIBC_2.17)(64bit) libopenblas-gnu-hpc-devel openmpi3-gnu-hpc-devel superlu-gnu-hpc-devel"

inherit rpm
