SUMMARY = "A wrapper for the SLICOT control and systems library"
DESCRIPTION = "Slycot is a wrapper for the SLICOT control and systems library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "python310-slycot-0.5.4-1.1.aarch64.rpm"
RPM_HASH = "a5f4738ae629775a82e51b3800cf51908427165dbab47b12eb41fbc32ad22d0145c12af6be95b5cc356da7ff5200615f59dfa5841ad6896d624e643a26a3aa03"

RPROVIDES:${PN} += "python3-slycot \
python3.10dist(slycot) \
python310-slycot \
python310-slycot(aarch-64) \
python3dist(slycot)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
liblapack.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
python(abi) \
python310-numpy"

inherit rpm
