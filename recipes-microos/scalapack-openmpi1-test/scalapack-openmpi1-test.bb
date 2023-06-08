SUMMARY = "Test programs for ScaLAPACK (openmpi1)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi1-test-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "10da2d1717ccb763927f20cd5ce3e75531b5033be6f6c99033c863c1dc0440ec091616cfda25f1d1eace74b161a8afadf204a482ab7e351af0f6f4d78826b6fc"

RPROVIDES:${PN} += "scalapack-openmpi1-test scalapack-openmpi1-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi.so.12()(64bit) libmpi_mpifh.so.12()(64bit)"

inherit rpm
