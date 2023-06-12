SUMMARY = "Development files for Indicator Display Objects"
DESCRIPTION = "Shared library providing extra GTK+ menu items for display in \
system indicators. \
 \
This package contains the development files for Ido."
LICENSE = "GPL-3.0-only & LGPL-3.0-only & LGPL-2.1-only"

PV = "13.10.0+bzr20161028"

RPM_NAME = "ido-devel-13.10.0+bzr20161028-3.16.aarch64.rpm"
RPM_HASH = "cf1e932d42095cdce7d5b165ad64564a2a759b8b83e8724d27c07e48e7147eac1ddebfef6b173653d96b57eb80e8d6483da2602e768cf0e296e9232824b907fa"

RPROVIDES:${PN} += "ido-devel \
ido-devel(aarch-64) \
pkgconfig(libido3-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libido3-0_1-0 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-introspection-1.0) \
pkgconfig(gtk+-3.0) \
typelib-1_0-Ido3-0_1"

inherit rpm
