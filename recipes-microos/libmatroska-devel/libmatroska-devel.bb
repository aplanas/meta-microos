SUMMARY = "Library to Deal with Matroska Files"
DESCRIPTION = "Libmatroska is a C++ library to parse Matroska files (.mkv and .mka). \
It depends on libebml to work. You only need this package to compile \
your own applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "libmatroska-devel-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "37fb3408b0d943d527315ed224b7588d74db6310413cf17957cac4de195beca2c273e09189bcb5b44ce5f1affa5acdefbaccc237ecc0ff0a225be35c00372fde"

RPROVIDES:${PN} += "cmake(Matroska) \
libmatroska-devel \
libmatroska-devel(aarch-64) \
pkgconfig(libmatroska)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatroska7 \
pkgconfig(libebml)"

inherit rpm
