SUMMARY = "Development files for sysprof"
DESCRIPTION = "The sysprof-devel package contains libraries and header files for \
developing applications that use sysprof."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-devel-3.48.0-1.1.aarch64.rpm"
RPM_HASH = "484155d8b118984e9ecaf04184b0ef4c6a6254c70fc1d028a5678a6ca10a579bcf9a7740f1661e054d95b365238a79d1f755b1d687143106b0621ff8f0e6c83a"

RPROVIDES:${PN} += "pkgconfig(sysprof-4) sysprof-devel sysprof-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config pkgconfig(gio-2.0) pkgconfig(gio-unix-2.0) pkgconfig(json-glib-1.0) pkgconfig(polkit-gobject-1) sysprof"

inherit rpm
