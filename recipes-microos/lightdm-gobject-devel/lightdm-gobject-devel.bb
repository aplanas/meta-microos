SUMMARY = "Development Files for liblightdm-gobject-1-0"
DESCRIPTION = "This package contains development files needed for developing \
GObject-based LightDM clients."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "lightdm-gobject-devel-1.32.0-2.2.aarch64.rpm"
RPM_HASH = "fc89a78d0d9b48b36cde8a61a2557b584b141358e16834e2502fd6c9eb776aaf56ac13d732fd37ba70681a46b1af73d3917245b2ee0f852a3616dd536c2d0cb9"

RPROVIDES:${PN} += "lightdm-gobject-devel \
lightdm-gobject-devel(aarch-64) \
pkgconfig(liblightdm-gobject-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightdm-gobject-1-0 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libxklavier) \
pkgconfig(x11)"

inherit rpm
