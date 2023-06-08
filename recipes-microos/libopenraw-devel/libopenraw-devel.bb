SUMMARY = "A library to decode digital camera RAW files"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.4"

RPM_NAME = "libopenraw-devel-0.3.4-2.1.aarch64.rpm"
RPM_HASH = "a2d615901f60bd950d898e9d109ee7fd4c23d8c24df9a918a7b1485941cd7b8c33782b813930b985e3ba6b28f5041543c13a552b1c37248d11ed931b7a752e79"

RPROVIDES:${PN} += "libopenraw-devel libopenraw-devel(aarch-64) pkgconfig(libopenraw-0.3) pkgconfig(libopenraw-gnome-0.3)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gdk-pixbuf-devel libopenraw9 pkgconfig(libopenraw-0.3)"

inherit rpm
