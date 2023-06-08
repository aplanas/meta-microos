SUMMARY = "SIP Swiss Army Knife"
DESCRIPTION = "Sipsak is a small command line tool for developers and administrators \
of Session Initiation Protocol (SIP) applications. It can be used for \
some simple tests on SIP applications and devices, including sending \
OPTIONS requests, sending text files with SIP requests, traceroute, \
user location test, flooding test, etc"
LICENSE = "GPL-2.0-only"

PV = "0.9.8.1"

RPM_NAME = "sipsak-0.9.8.1-1.11.aarch64.rpm"
RPM_HASH = "58f3b7e44b2cd927fd73161799005b2ba233697f3688aa45866c41a4c01227aea336ea97d20a61dfb5c6310fe3ec6c5ae0909ec7e4ce49344c4f2414551f88fc"

RPROVIDES:${PN} += "sipsak sipsak(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
