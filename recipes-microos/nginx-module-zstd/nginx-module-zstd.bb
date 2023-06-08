SUMMARY = "NGINX module for Zstandard compression"
DESCRIPTION = "This is a nginx module to enable Zstd (de)compression on HTTP streams. \
 \
Zstd, short for Zstandard, is a lossless compression algorithm. Speed \
vs. compression trade-off is configurable in small increments."
LICENSE = "BSD-2-Clause"

PV = "0~g23"

RPM_NAME = "nginx-module-zstd-0~g23-1.1.aarch64.rpm"
RPM_HASH = "0dabe95c7a21a5377768ba04b0efa5748a1c0fcc4d824010071caff3ec38a8bf6cf5fafcaae5668b67750df83264fde8ffb731df454cd81976425687ae720530"

RPROVIDES:${PN} += "nginx-module-zstd nginx-module-zstd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libzstd.so.1()(64bit) nginx"

inherit rpm
