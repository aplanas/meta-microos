SUMMARY = "Development files for sysprof-ui"
DESCRIPTION = "The sysprof-ui-devel package contains libraries and header files for \
developing applications that use sysprof-ui."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-ui-devel-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "11fffb34cc93b63cd585c86ee426c3d5ea409af9318f51736e7e12afbe5495ffa08470d8a03eeba6e8594d6138a54d0ab9610cce9217485846a90ffab9f402c4"

RPROVIDES:${PN} += "pkgconfig(sysprof-ui-5) sysprof-ui-devel sysprof-ui-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(gio-2.0) pkgconfig(gtk4) pkgconfig(libadwaita-1) pkgconfig(sysprof-4) sysprof-ui"

inherit rpm
