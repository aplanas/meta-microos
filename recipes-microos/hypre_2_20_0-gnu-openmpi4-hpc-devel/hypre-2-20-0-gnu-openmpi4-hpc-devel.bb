SUMMARY = "Headers and library links for libHYPRE_2_20_0-gnu-openmpi4-hpc"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi4 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre_2_20_0-gnu-openmpi4-hpc-devel-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "fb1fbec9d884f584997adde65aeaef86bc3bbc7d431293c3cec271118ea6c3919dd02ddc7b46673789039cd1402237b83367fa4527e20c1181d41f329ed648a1"

RPROVIDES:${PN} += "hypre_2_20_0-gnu-openmpi4-hpc-devel hypre_2_20_0-gnu-openmpi4-hpc-devel(aarch-64) pkgconfig(hypre)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHYPRE_2_20_0-gnu-openmpi4-hpc libc.so.6(GLIBC_2.17)(64bit) libopenblas-gnu-hpc-devel openmpi4-gnu-hpc-devel superlu-gnu-hpc-devel"

inherit rpm
