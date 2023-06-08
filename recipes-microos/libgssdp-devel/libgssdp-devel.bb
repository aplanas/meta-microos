SUMMARY = "Library for resource discovery and announcement over SSDP - Development Files"
DESCRIPTION = "gssdp offers a GObject-based API for handling resource discovery and \
announcement over SSDP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.2"

RPM_NAME = "libgssdp-devel-1.6.2-2.1.aarch64.rpm"
RPM_HASH = "ea50bbfe51df0545a3772ca05c9f005d648ea015bfce28d289f52814aca0ee119c34cb4d3d0ba2a49188b0ddbc7b936cd6b278b9f2b42733f891a98dd1b848c0"

RPROVIDES:${PN} += "libgssdp-devel libgssdp-devel(aarch-64) pkgconfig(gssdp-1.6)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgssdp-1_6-0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(libsoup-3.0) typelib-1_0-GSSDP-1_0"

inherit rpm
