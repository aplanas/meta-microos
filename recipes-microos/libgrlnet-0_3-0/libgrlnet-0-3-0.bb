SUMMARY = "Framework for browsing and searching media content -- Networking Helper Library"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "libgrlnet-0_3-0-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "fda5cd120ae0e15353078202c386f35829cb3b50eacb7e74bb6e47c657200c110e2677223c9cafe70d8903e1cd4d6ccda5145fabf300d3c86397d4e9d014f7b9"

RPROVIDES:${PN} += "libgrlnet-0.3.so.0()(64bit) libgrlnet-0_3-0 libgrlnet-0_3-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgrilo-0.3.so.0()(64bit) libsoup-3.0.so.0()(64bit)"

inherit rpm
