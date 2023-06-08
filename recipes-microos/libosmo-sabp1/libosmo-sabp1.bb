SUMMARY = "Osmocom Service Area Broadcast Protocol library"
DESCRIPTION = "Osmocom code for the Service Area Broadcast Protocol interface."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-sabp1-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "16d4619f757f9cd3eb21acbca1132dd3ccccfad1bc0a68b7eeefebe6d379792b300c3ba0add351480526969644d6bc401415b776bc45f323df3ac204dfb9d226"

RPROVIDES:${PN} += "libosmo-sabp.so.1()(64bit) libosmo-sabp1 libosmo-sabp1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasn1c.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
