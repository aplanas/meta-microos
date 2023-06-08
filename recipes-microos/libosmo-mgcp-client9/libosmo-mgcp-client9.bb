SUMMARY = "Osmocom's Media Gateway Control Protocol client library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol client library."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-client9-1.9.0-1.9.aarch64.rpm"
RPM_HASH = "98adfb1b93fe3f0ac49dc3fec1f74f5360a3a2a363a85b249566ae90defec99f545b3bf90eb49d7d9a45e42dd88419886ebffe0ef17ea7f386c22b9732b4c4b5"

RPROVIDES:${PN} += "libosmo-mgcp-client.so.9()(64bit) libosmo-mgcp-client9 libosmo-mgcp-client9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
