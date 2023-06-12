SUMMARY = "Framework for browsing and searching media content -- Development Files"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-devel-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "91857fe468dcb426450ade50b4aa7ff17d3d1001fa92c1fa60d129459a7dc8bcc0ddd71f140b5d348950a854f879a12779893c9e40d2bf039f305feb6f7f8b27"

RPROVIDES:${PN} += "grilo-devel grilo-devel(aarch-64) pkgconfig(grilo-0.3) pkgconfig(grilo-net-0.3) pkgconfig(grilo-pls-0.3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgrilo-0_3-0 libgrlnet-0_3-0 libgrlpls-0_3-0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(grilo-0.3) pkgconfig(libxml-2.0) typelib-1_0-Grl-0_3 typelib-1_0-GrlNet-0_3 typelib-1_0-GrlPls-0_3"

inherit rpm
