SUMMARY = "Development files for the X Pixmap image file format library"
DESCRIPTION = "libXpm facilitates working with XPM (X PixMap), a format for \
storing/retrieving X pixmaps to/from files. \
 \
This package contains the development headers for the library found \
in libXpm4."
LICENSE = "MIT"

PV = "3.5.16"

RPM_NAME = "libXpm-devel-3.5.16-1.1.aarch64.rpm"
RPM_HASH = "ea8dc09826d551753c3c9371598b7b451791888d8062a6b705f163ab50e1e4a880800cce05dc63e844e41fe913e966540a37d617e31c8b17240d202a80d0659a"

RPROVIDES:${PN} += "libXpm-devel libXpm-devel(aarch-64) pkgconfig(xpm) xorg-x11-libXpm-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXpm4 pkgconfig(x11)"

inherit rpm
