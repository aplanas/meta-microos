SUMMARY = "Header files for libslab"
DESCRIPTION = "This library makes it easy to create tile-based UI for MATE, as seen in \
gnome-main-menu. \
 \
This package provides libslab development files."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "libmate-slab-devel-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "af16d0d2ffb73860ca9f171b1f39d6fb72a9c5edb821a450fed53cad05c5ea8f5225adb70577940be8ff0d13ea38fb4ccd6042f0520620e229555f26f6604ccb"

RPROVIDES:${PN} += "libmate-slab-devel libmate-slab-devel(aarch-64) pkgconfig(mate-slab)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmate-slab0 pkgconfig(gdk-3.0) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(libmate-menu) pkgconfig(librsvg-2.0) pkgconfig(mate-desktop-2.0)"

inherit rpm
