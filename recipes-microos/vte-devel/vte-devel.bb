SUMMARY = "Development files for the VTE terminal emulator library"
DESCRIPTION = "VTE is a terminal emulator library that provides a terminal widget for \
use with GTK+ as well as handling of child process and terminal \
emulation settings. \
 \
This package contains the files needed for building applications using \
VTE."
LICENSE = "LGPL-2.0-only"

PV = "0.72.1"

RPM_NAME = "vte-devel-0.72.1-1.1.aarch64.rpm"
RPM_HASH = "5ae1e94c0d66803ad7c639b65ea0d3fcf38ee8b9d8d66cfc931d4e760096450fda25617bf3d39d77850fd6735dc5b01cb87957f4224bdcd0577f033e90219b35"

RPROVIDES:${PN} += "pkgconfig(vte-2.91) pkgconfig(vte-2.91-gtk4) vte-devel vte-devel(aarch-64) vte-doc"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvte-2_91-0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gtk+-3.0) pkgconfig(gtk4) pkgconfig(pango) typelib-1_0-Vte-2_91 typelib-1_0-Vte-3_91"

inherit rpm
