SUMMARY = "MATE Desktop keyboard configuration development files"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "libmatekbd-devel-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "b1ef1ee5ff5817b82ecdb713f819fc86c98cd803e028fb1a4a8d572bcea08713183c99a32ead8387c1bf804dda1570678bc9bf48c5aef8743683dc275f2aa493"

RPROVIDES:${PN} += "libmatekbd-devel libmatekbd-devel(aarch-64) pkgconfig(libmatekbd) pkgconfig(libmatekbdui)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmatekbd4 matekbd-common pkgconfig(gdk-3.0) pkgconfig(gio-2.0) pkgconfig(gmodule-export-2.0) pkgconfig(libxklavier)"

inherit rpm
