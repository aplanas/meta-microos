SUMMARY = "SASL authentication in lighttpd"
DESCRIPTION = "A module to provide SASL authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.69"

RPM_NAME = "lighttpd-mod_authn_sasl-1.4.69-1.3.aarch64.rpm"
RPM_HASH = "6dce6f5d21aab5f14113d2df912f3f020389702eb368f04ed37072288c312d242f18922ca81e1e5ee22f15bab1dad583aefb6e82804e15f6de399704b25d4be2"

RPROVIDES:${PN} += "lighttpd-mod_authn_sasl lighttpd-mod_authn_sasl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libsasl2.so.3()(64bit) lighttpd"

inherit rpm
