SUMMARY = "Framework for browsing and searching media content -- Development Files"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.15"

RPM_NAME = "grilo-devel-0.3.15-2.1.aarch64.rpm"
RPM_HASH = "6d5d870bc7a4ab9d90f46c4ab08d9ce0d1dfbae89b48e10eac1bd0c05e4fbad47119948b8fa3c76672c3af9dd9f351cd9e8fef8b24a479fc43e845127b06a03b"

RPROVIDES:${PN} += "grilo-devel grilo-devel(aarch-64) pkgconfig(grilo-0.3) pkgconfig(grilo-net-0.3) pkgconfig(grilo-pls-0.3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgrilo-0_3-0 libgrlnet-0_3-0 libgrlpls-0_3-0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gobject-2.0) pkgconfig(grilo-0.3) pkgconfig(libxml-2.0) typelib-1_0-Grl-0_3 typelib-1_0-GrlNet-0_3 typelib-1_0-GrlPls-0_3"

inherit rpm
