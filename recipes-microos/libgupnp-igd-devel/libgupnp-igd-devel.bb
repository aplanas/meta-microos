SUMMARY = "Library to handle UPnP IGD port mapping - Development Files"
DESCRIPTION = "GUPnP-IGD is a library to handle UPnP IGD port mapping. It is supposed \
to have a very simple API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "libgupnp-igd-devel-1.6.0-2.1.aarch64.rpm"
RPM_HASH = "b2f1b5ca672f005af704c655250832ad5bce3a180f29f2bd2d05d271eace51429e0d8ac124fb88ac1ace9a0380a975c096632dc3f14b95fcabcaddec3ede5cb9"

RPROVIDES:${PN} += "libgupnp-igd-devel libgupnp-igd-devel(aarch-64) pkgconfig(gupnp-igd-1.6)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgupnp-igd-1_6-0 pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(gssdp-1.6) pkgconfig(gthread-2.0) pkgconfig(gupnp-1.6) typelib-1_0-GUPnPIgd-1_6"

inherit rpm
