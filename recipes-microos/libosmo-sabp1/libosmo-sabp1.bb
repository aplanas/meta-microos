SUMMARY = "Osmocom Service Area Broadcast Protocol library"
DESCRIPTION = "Osmocom code for the Service Area Broadcast Protocol interface."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-sabp1-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "23e325cf398af279ac8b98179f162d8b80529e86fc4cb29413eb599c6e12a6ed4ebae14d753d7f9e8e4810a244d792961e790651280c61091924ad54293a6a2f"

RPROVIDES:${PN} += "libosmo-sabp.so.1()(64bit) libosmo-sabp1 libosmo-sabp1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasn1c.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.20()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
