SUMMARY = "Standalone program using libosmo-mslookup"
DESCRIPTION = "Standalone program using libosmo-mslookup to easily integrate with programs \
that want to connect services (SIP, SMS,...) to the current location of a \
subscriber."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-mslookup-client-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "93ae35564268e2807bae847496a6738f8c346349600fa882cb90c6fa8aa6425c34eafe7f6f0b62c4791145685fecad91b86dcad5ae2223451d70a663f54ce88c"

RPROVIDES:${PN} += "osmo-mslookup-client \
osmo-mslookup-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmo-mslookup.so.0()(64bit) \
libosmocore.so.20()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
