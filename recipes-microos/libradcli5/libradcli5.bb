SUMMARY = "A RADIUS client library"
DESCRIPTION = "The radcli library is a library for writing RADIUS Clients. The library's \
approach is to allow writing RADIUS-aware application in less than 50 lines \
of C code. It was based originally on freeradius-client and is source compatible \
with it."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "libradcli5-1.3.1-1.3.aarch64.rpm"
RPM_HASH = "e1004cfaf831ec668a95ba73924016e75f89e8de02dee526d5c1ccf0b261dea448b4309e5e99cdfb436c37eebcd801dd9bee455caa4bd946421e941e685ce7a3"

RPROVIDES:${PN} += "libradcli.so.5()(64bit) libradcli.so.5(RADCLI_5)(64bit) libradcli5 libradcli5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.22)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit)"

inherit rpm
