SUMMARY = "GTK devel files for libfm"
DESCRIPTION = "GTK libfm libraries for development"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-gtk-devel-1.3.2-1.12.aarch64.rpm"
RPM_HASH = "3f1e7b7d32374cf024f07275b18b9934e00c552f0dff2df00fcf115117ece2cacdde29d3a2ce3ad8016d46a419a3a3745858a3dfb30e31a279f72b51204de75a"

RPROVIDES:${PN} += "libfm-gtk-devel libfm-gtk-devel(aarch-64) pkgconfig(libfm-gtk)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gtk2-devel libfm libfm-gtk4 libfm4 pkgconfig pkgconfig(gio-unix-2.0) pkgconfig(gthread-2.0) pkgconfig(gtk+-2.0) pkgconfig(libfm)"

inherit rpm
