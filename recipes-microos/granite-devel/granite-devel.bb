SUMMARY = "Development files for the Granite development library"
DESCRIPTION = "Granite is an extension of GTK+. \
 \
This package contains the development files for libgranite."
LICENSE = "LGPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "granite-devel-6.2.0-1.7.aarch64.rpm"
RPM_HASH = "0cc169e90f6cd5dce8dc84be7810b748fa72d3064d9e42b10939beaf1d0dfb063e26460ff65f5470c1611623da910ee9a1e253ef58fe92d29efba931b851ed82"

RPROVIDES:${PN} += "granite-devel granite-devel(aarch-64) pkgconfig(granite)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgranite6 pkgconfig(gee-0.8) pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0)"

inherit rpm
