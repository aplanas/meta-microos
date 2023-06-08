SUMMARY = "Simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "xplayer-plparser-devel-1.0.2-2.12.aarch64.rpm"
RPM_HASH = "b87c4c3fb7fbc6fe597605acb895a80475be07ffdfb5c1662ed362ad95d5ef3f3807a42e6c9ceae945570bf539531534a565929a37e523b5d130f8a915d26996"

RPROVIDES:${PN} += "pkgconfig(xplayer-plparser) pkgconfig(xplayer-plparser-mini) xplayer-plparser-devel xplayer-plparser-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libxplayer-plparser-mini18 libxplayer-plparser18 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gmime-3.0) pkgconfig(gobject-2.0) pkgconfig(gthread-2.0) pkgconfig(libxml-2.0) typelib-1_0-XplayerPlParser-1_0"

inherit rpm
