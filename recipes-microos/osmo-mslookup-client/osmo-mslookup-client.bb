SUMMARY = "Standalone program using libosmo-mslookup"
DESCRIPTION = "Standalone program using libosmo-mslookup to easily integrate with programs \
that want to connect services (SIP, SMS,...) to the current location of a \
subscriber."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-mslookup-client-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "dbf4a03502491d39d2445a728b8903e8c45effb26fa42f00eea1e7ea0909499e00514bc2558b195d0fc3226d0eba77fd41fb988e41fd031d511667015505eb42"

RPROVIDES:${PN} += "osmo-mslookup-client osmo-mslookup-client(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-mslookup.so.0()(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
