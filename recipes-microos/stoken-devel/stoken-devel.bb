SUMMARY = "Development files for stoken"
DESCRIPTION = "Software Token for Linux/UNIX. It's a token code generator compatible with RSA \
SecurID 128-bit (AES) tokens. It is a hobbyist project, not affiliated with or \
endorsed by RSA Security. \
 \
This package provides the development files for stoken."
LICENSE = "LGPL-2.0-or-later & BSD-3-Clause"

PV = "0.92"

RPM_NAME = "stoken-devel-0.92-1.21.aarch64.rpm"
RPM_HASH = "2bfd620e12e100bdae676494ef12f830af23a3272fafc29c8365f8c42b705febebc396b4825b7fbd3994b6f2559b279858560e10c78b5c3b4183f3f51fb6d6e9"

RPROVIDES:${PN} += "pkgconfig(stoken) \
stoken-devel \
stoken-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstoken1 \
pkgconfig(libtomcrypt) \
pkgconfig(libxml-2.0)"

inherit rpm
