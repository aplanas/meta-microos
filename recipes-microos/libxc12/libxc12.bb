SUMMARY = "Library of exchange and correlation functionals to be used in DFT codes"
DESCRIPTION = "Libxc is a library of exchange and correlation functionals. Its \
purpose is to be used in codes that implement density-functional \
theory. The library includes most of the local density \
approximations (LDAs), generalized density approximation (GGAs), and \
meta-GGAs. The library provides values for the energy density and its \
1st, 2nd, and (for the LDAs) 3rd derivatives. \
 \
This package contains the library of libxc."
LICENSE = "MPL-2.0"

PV = "6.0.0"

RPM_NAME = "libxc12-6.0.0-1.3.aarch64.rpm"
RPM_HASH = "2b3ae635aa8a363871355a13c71ca3ca740665cecfeb1339301b2418e0890bfd13ef1a1f82b4b43a9533258fdea8fb526b6deab3bf6d35a73f8fdd9858be0438"

RPROVIDES:${PN} += "libxc.so.12()(64bit) libxc12 libxc12(aarch-64) libxcf03.so.12()(64bit) libxcf90.so.12()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
