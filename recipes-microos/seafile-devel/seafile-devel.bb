SUMMARY = "Development files for seafile"
DESCRIPTION = "The seafile-devel package contains libraries and header files for \
developing applications that use seafile."
LICENSE = "GPL-2.0-only"

PV = "9.0.1"

RPM_NAME = "seafile-devel-9.0.1-1.1.aarch64.rpm"
RPM_HASH = "6da258622f5aaadfdf7b6e695265e9113fb09cd602c5d2a519b4b6b597ffa8466132b00c4038bc76995c9604b36a0121b81b6ece523b2030b9088af14133bc92"

RPROVIDES:${PN} += "pkgconfig(libseafile) \
seafile-devel \
seafile-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
seafile"

inherit rpm
