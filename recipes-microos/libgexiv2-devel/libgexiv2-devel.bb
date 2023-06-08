SUMMARY = "A GObject-based Exiv2 wrapper -- Development Files"
DESCRIPTION = "gexiv2 is a GObject-based wrapper around the Exiv2 library. It makes the \
basic features of Exiv2 available to GNOME applications."
LICENSE = "GPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgexiv2-devel-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "6fe81132f61198d1bf997b7dfa81db76b08bcf5c508eedf1295d31d052726a00b75885d9db2d3591c6fa1f68c342f07c461f3a98fd9d6988a4bf5634a8a82f6a"

RPROVIDES:${PN} += "libgexiv2-devel libgexiv2-devel(aarch-64) pkgconfig(gexiv2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgexiv2-2 pkgconfig(exiv2) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0)"

inherit rpm
