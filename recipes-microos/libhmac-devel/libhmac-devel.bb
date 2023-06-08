SUMMARY = "Development files for libhmac"
DESCRIPTION = "Development files for libhmac, a library to support various Hash-based Message Authentication Codes (HMAC). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libhmac."
LICENSE = "LGPL-3.0-or-later"

PV = "20230407"

RPM_NAME = "libhmac-devel-20230407-1.1.aarch64.rpm"
RPM_HASH = "4ea851e058f9fc2143e8abaf1b7023e45f9f263ca2eabd4eac704d152b18beda32df3c9273ffa4bbecd3c00c3724e594a29eb61e74c6b61932636ac515737cfd"

RPROVIDES:${PN} += "libhmac-devel libhmac-devel(aarch-64) pkgconfig(libhmac)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libhmac1"

inherit rpm
