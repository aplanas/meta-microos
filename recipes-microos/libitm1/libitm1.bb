SUMMARY = "The GNU Compiler Transactional Memory Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fgnu-tm option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.0.1+git7231"

RPM_NAME = "libitm1-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "30dc462f5eb55575d13f69d1708fd342980011d2dd0aa3606d34277683a0cdc3c32aca0610cff63d82502008407b4c895224d831a255ead103e6626dd8544438"

RPROVIDES:${PN} += "libitm.so.1()(64bit) libitm.so.1(LIBITM_1.0)(64bit) libitm.so.1(LIBITM_1.1)(64bit) libitm1 libitm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
