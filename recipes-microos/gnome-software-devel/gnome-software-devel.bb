SUMMARY = "Development files for the GNOME software store"
DESCRIPTION = "This subpackage contains the header files for developing \
GNOME software store plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gnome-software-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "cdb6546d9f6ac55bfdd648958465b2715949ece1395fbbb45c4ae8cada08913ebe59694b85f5258de520471e5682d7c4240dd9ec8c8d6ca8cd1920c1c1ab0525"

RPROVIDES:${PN} += "gnome-software-devel gnome-software-devel(aarch-64) pkgconfig(gnome-software)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnome-software pkgconfig(appstream) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gtk4) pkgconfig(json-glib-1.0) pkgconfig(libsoup-3.0) pkgconfig(polkit-gobject-1) pkgconfig(sysprof-capture-4) pkgconfig(xmlb)"

inherit rpm
