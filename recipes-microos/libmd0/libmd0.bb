SUMMARY = "Provides message digest functions from BSD systems"
DESCRIPTION = "The libmd library provides a few message digest ('hash') functions, as \
found on various BSDs on a library with the same name and with a compatible \
API. \
 \
Digests supported: MD2/4/5, RIPEMD160, SHA1, SHA2-256/384/512."
LICENSE = "BSD-2-Clause | BSD-3-Clause | ISC | SUSE-Public-Domain"

PV = "1.0.4"

RPM_NAME = "libmd0-1.0.4-1.7.aarch64.rpm"
RPM_HASH = "76a60d7710751e4ebdbe96b0bf79036e25a563668dafe56342048c7503b13abadf9c381e78d8cd131a5d9aaf5766096a3038ff207c34aedadf6415a408a7de6c"

RPROVIDES:${PN} += "libmd.so.0()(64bit) libmd.so.0(LIBMD_0.0)(64bit) libmd0 libmd0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
