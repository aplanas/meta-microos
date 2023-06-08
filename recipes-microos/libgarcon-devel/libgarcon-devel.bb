SUMMARY = "Development Files for garcon"
DESCRIPTION = "This package contains the files needed for developing applications based on \
garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.18.1"

RPM_NAME = "libgarcon-devel-4.18.1-2.1.aarch64.rpm"
RPM_HASH = "8c8014b9bfd00a8f95ead96a2fa83c4edf8f01a2b43d3b63d91b247154bce46221f57e04f9b6cffb693ae0973a3acfe8c170a0722839dc22e49558ac142e52cb"

RPROVIDES:${PN} += "libgarcon-devel libgarcon-devel(aarch-64) pkgconfig(garcon-1) pkgconfig(garcon-gtk3-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgarcon-1-0 pkgconfig(garcon-1) pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-3.0) pkgconfig(libxfce4ui-2)"

inherit rpm
