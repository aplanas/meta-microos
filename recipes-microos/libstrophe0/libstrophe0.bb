SUMMARY = "A XMPP library for C"
DESCRIPTION = "The libstrophe library is a XMPP library written in C."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.12.2"

RPM_NAME = "libstrophe0-0.12.2-1.4.aarch64.rpm"
RPM_HASH = "f8f300c624b4946bfc0ee7bcf3bde4c49b34fb5d6893a1d1d2754051fa87046496fed5e7cc82f67650862880ea1b7c00bcbf529fe5e5c5df777db2d68dab095a"

RPROVIDES:${PN} += "libstrophe.so.0()(64bit) \
libstrophe0 \
libstrophe0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
