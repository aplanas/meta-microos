SUMMARY = "Development files for gtk-layer-shell"
DESCRIPTION = "Development files and headers for gtk-layer-shell"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "0.8.1"

RPM_NAME = "gtk-layer-shell-devel-0.8.1-1.1.aarch64.rpm"
RPM_HASH = "dd40f46f1191f0327e4ed75654a9ae0635c5747c1caa204351b77d654372fcd37e53ad551539e71406155b5b0b103a001ebe8b4b694065cf181920773312ab8e"

RPROVIDES:${PN} += "gtk-layer-shell-devel gtk-layer-shell-devel(aarch-64) pkgconfig(gtk-layer-shell-0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgtk-layer-shell0 pkgconfig(gtk+-3.0) pkgconfig(wayland-client) typelib-1_0-GtkLayerShell-0_1"

inherit rpm
