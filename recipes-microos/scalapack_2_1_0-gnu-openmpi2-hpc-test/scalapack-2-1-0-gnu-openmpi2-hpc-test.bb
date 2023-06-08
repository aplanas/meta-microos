SUMMARY = "Test programs for ScaLAPACK (openmpi2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack_2_1_0-gnu-openmpi2-hpc-test-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "a316861b2f8f2dbb8cb4d8f3fb3e0e15b4b0150a5e3845bd578cf232b58b1643286cadc5f42d4f2a6099fbd572f715054d04d7774d1ede9d1d3341461f245948"

RPROVIDES:${PN} += "scalapack_2_1_0-gnu-openmpi2-hpc-test scalapack_2_1_0-gnu-openmpi2-hpc-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
