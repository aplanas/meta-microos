SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libitm1-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "8b7743e9c1edcfa4d66950a7b4b6960505158c4519b073d171a72adbc0838390ff9e213b7f13a6c0892d0056430e8146da4390d8f07887bc4945f90d4f11a8e2"

RPROVIDES:${PN} += "libitm.so.1()(64bit) libitm.so.1(LIBITM_1.0)(64bit) libitm.so.1(LIBITM_1.1)(64bit) libitm1 libitm1-gcc7 libitm1-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
