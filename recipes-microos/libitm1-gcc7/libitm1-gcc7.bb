SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "7.5.0+r278197"

RPM_NAME = "libitm1-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "37c8090d0e0984d816b2aa55a84916bf5bff9149566395c4b6cf2d06a92724c4cfd984b69595546c0ff19e61aaefc4af3a67eebf29c42c49eb6e98f2b71130e4"

RPROVIDES:${PN} += "libitm.so.1()(64bit) libitm.so.1(LIBITM_1.0)(64bit) libitm.so.1(LIBITM_1.1)(64bit) libitm1 libitm1-gcc7 libitm1-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
