SUMMARY = "Development Files for tumbler"
DESCRIPTION = "This package contains the development files needed for developing tumbler \
plugins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "tumbler-devel-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "e98a435e46a18b18ac1e308735f01d02c993226859f8786d642cdcca16324bc04e28ab059ccf176d448a54573bbd73b3fc96f38028adfad1b8b0c6b313101182"

RPROVIDES:${PN} += "pkgconfig(tumbler-1) tumbler-devel tumbler-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gthread-2.0) tumbler"

inherit rpm
