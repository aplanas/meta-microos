SUMMARY = "Development files for libofx, an OFX Command Parser and API"
DESCRIPTION = "LibOFX is a parser and API for applications to support \
OFX command responses, usually provided by financial institutions for \
statement downloads. \
 \
This subpackage contains the header files for the C API."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.5"

RPM_NAME = "libofx-devel-0.10.5-1.6.aarch64.rpm"
RPM_HASH = "f5e143d87b0176135abe41d82212c28bafb6da5d1ada54766cdd73aa786a8ba2203aca692e71da8ba898dd3bad561586679e14ad20910ec32892510948a65372"

RPROVIDES:${PN} += "libofx-devel libofx-devel(aarch-64) pkgconfig(libofx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libofx libofx7"

inherit rpm
