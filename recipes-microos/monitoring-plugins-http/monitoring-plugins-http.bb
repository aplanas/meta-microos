SUMMARY = "Test the HTTP service on the specified host"
DESCRIPTION = "This plugin tests the HTTP service on the specified host. It can test \
normal (http) and secure (https) servers, follow redirects, search for \
strings and regular expressions, check connection times, and report on \
certificate expiration times."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-http-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "7cc24a74fd4ccefc43ede29e87c116a95e5cbabe2e9065b020f1ee4aa91e46512aedeefcd68638a649685336353a32e996ad02610b9353857b099f20950616fc"

RPROVIDES:${PN} += "monitoring-plugins-http monitoring-plugins-http(aarch-64) nagios-plugins-http"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
