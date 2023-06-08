SUMMARY = "Development files for rofi"
DESCRIPTION = "Development files and headers for rofi"
LICENSE = "MIT"

PV = "1.7.5"

RPM_NAME = "rofi-devel-1.7.5-2.3.aarch64.rpm"
RPM_HASH = "5784a3da97346a3b4cf2914e60aa435a6cedd608ae22f4ec567727ccc4037db4272d1820638cc606c63964c40a6ad12368db2c80eb4423f1ccc58898a5ff1d9f"

RPROVIDES:${PN} += "pkgconfig(rofi) rofi-devel rofi-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(cairo) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0)"

inherit rpm
