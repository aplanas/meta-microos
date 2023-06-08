SUMMARY = "A module to control the request handling in lighttpd"
DESCRIPTION = "A module to control the request handling in lighttpd. \
 \
It is the successor of mod_cml."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_magnet-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "7656595a759820108c8d607e910f6a48538755bcc3c5d01a5d0f64ff616e48f254ccd7f3b4983c435f77c0b08d5addb4f9818a0d87fb1c7b79126e9dd3654fa1"

RPROVIDES:${PN} += "config(lighttpd-mod_magnet) lighttpd-mod_magnet lighttpd-mod_magnet(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblua5.1.so.5()(64bit) lighttpd"

inherit rpm
