SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles - Development Files"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.1"

RPM_NAME = "libgupnp-av-devel-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "4d1526fb8cf39cdc8d0acd90a561344874bb5a68ac40ace4fc52236ee2b2a6832948ee76ba0de429b5f38b426b2381b2fe93d802ea7240b691bb5bd7c16d5a6e"

RPROVIDES:${PN} += "libgupnp-av-devel libgupnp-av-devel(aarch-64) pkgconfig(gupnp-av-1.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgupnp-av-1_0-3 pkgconfig(glib-2.0) pkgconfig(gobject-2.0) pkgconfig(libxml-2.0) typelib-1_0-GUPnPAV-1_0"

inherit rpm
