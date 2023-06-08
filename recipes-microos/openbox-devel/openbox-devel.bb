SUMMARY = "Includes and static libraries for openbox"
DESCRIPTION = "Development Includes and static libraries for openbox."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "openbox-devel-3.6.1-3.31.aarch64.rpm"
RPM_HASH = "e6be870bc9fbb88dc974ab1be782d4e7b192c5cc54ec5b61d3900d5d680dbd33143e1fce8a02fc5c4188e84461483946a53d08fb97a54d66ff57af0d1b5f1677"

RPROVIDES:${PN} += "openbox-devel openbox-devel(aarch-64) pkgconfig(obrender-3.5) pkgconfig(obt-3.5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libobrender32 libobt2 pkgconfig(glib-2.0) pkgconfig(ice) pkgconfig(imlib2) pkgconfig(librsvg-2.0) pkgconfig(libxml-2.0) pkgconfig(obt-3.5) pkgconfig(pangoxft) pkgconfig(sm) pkgconfig(x11) pkgconfig(xft)"

inherit rpm
