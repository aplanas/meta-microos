SUMMARY = "Test programs for ScaLAPACK (openmpi4)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "scalapack-openmpi4-test-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "c829b73e9733a1dd1f6f320ee14fe99a9d3cffe7db476483b0adcc29aa0e254ee350bf8fa47b1b6804be88b5c19ffea0850bcb7f890daf77edcc18b1aa4d5d39"

RPROVIDES:${PN} += "scalapack-openmpi4-test scalapack-openmpi4-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libblas.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi.so.40()(64bit) libmpi_mpifh.so.40()(64bit)"

inherit rpm
