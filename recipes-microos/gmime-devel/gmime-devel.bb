SUMMARY = "MIME Parser and Utility Library -- Development Files"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.13"

RPM_NAME = "gmime-devel-3.2.13-1.1.aarch64.rpm"
RPM_HASH = "6641efb3a2fb9c5e4bde303d664cf9778418dc01be05df58dd041c1f4b0e2b3f2ed0d37a079cd87b3d4d40463a12f4dd404ab40f8897e005fdb91c85a5b414cb"

RPROVIDES:${PN} += "gmime-devel gmime-devel(aarch-64) pkgconfig(gmime-3.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgmime-3_0-0 pkgconfig(gio-2.0) pkgconfig(glib-2.0) pkgconfig(gobject-2.0)"

inherit rpm
