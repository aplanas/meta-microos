SUMMARY = "Development files for liblightgrep"
DESCRIPTION = "Development files for liblightgrep, a regex engine designed for digital forensics. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblightgrep."
LICENSE = "LGPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "liblightgrep-devel-1.4-5.34.aarch64.rpm"
RPM_HASH = "9de2df62dcf1c1c6c1a21aed0c0340e07d352e887c9a82d3214c8d99c827b6c4f82f38554512749850f66723c1915e9dfe9e6c2da39e8e7087ffd7fadee16e42"

RPROVIDES:${PN} += "liblightgrep-devel liblightgrep-devel(aarch-64) pkgconfig(lightgrep)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblightgrep0 pkgconfig(icu-uc)"

inherit rpm
