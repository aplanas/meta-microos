SUMMARY = "CELT is a very low delay audio codec"
DESCRIPTION = "CELT is a very low delay audio codec designed for high-quality communications. \
Its potential uses include video-conferencing and network music performance."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.3"

RPM_NAME = "libcelt051-0-0.5.1.3-10.29.aarch64.rpm"
RPM_HASH = "90171d40f9163ab7d800648f54300c81f78cae97b3f9dd4d6058d605480f46588e1a063e70e291ae9fa966bc9f8db66855d14fbe32f69d2cd6a9d5c1b6c6ee13"

RPROVIDES:${PN} += "libcelt051-0 libcelt051-0(aarch-64) libcelt051.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
