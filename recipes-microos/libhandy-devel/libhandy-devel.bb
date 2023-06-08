SUMMARY = "Source and header files for libhandy"
DESCRIPTION = "This package provides the source and header files for writing \
software using libhandy, a library to help with developing mobile UI \
using GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.2"

RPM_NAME = "libhandy-devel-1.8.2-1.3.aarch64.rpm"
RPM_HASH = "8daec244f230022c8af373313c1a0f1c667a8e1c9178de0462d6ffb36442fdaa3cb4e6207a2c4a9e86564dcd73a2abd112612ba5b8d95dd76e1b67e4d7fc7946"

RPROVIDES:${PN} += "libhandy-devel libhandy-devel(aarch-64) pkgconfig(libhandy-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libhandy-1-0 pkgconfig(gtk+-3.0) typelib-1_0-Handy-1_0"

inherit rpm
