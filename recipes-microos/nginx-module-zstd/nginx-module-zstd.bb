SUMMARY = "NGINX module for Zstandard compression"
DESCRIPTION = "This is a nginx module to enable Zstd (de)compression on HTTP streams. \
 \
Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments."
LICENSE = "BSD-2-Clause"

PV = "0~g23"

RPM_NAME = "nginx-module-zstd-0~g23-1.2.aarch64.rpm"
RPM_HASH = "1e8a6ecf61ed003d5a626cb44ff49570dfa64f915b40751b8be04b1b7b6f645af050753e607d698b92555102d3ec136bf0cd16b41e425ea1b31e1ecf88495f22"

RPROVIDES:${PN} += "nginx-module-zstd \
nginx-module-zstd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libzstd.so.1()(64bit) \
nginx"

inherit rpm
