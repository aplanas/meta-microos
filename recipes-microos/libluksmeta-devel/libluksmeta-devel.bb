SUMMARY = "Development files for libluksmeta"
DESCRIPTION = "The libluksmeta-devel package contains libraries and header files for \
developing applications that use libluksmeta."
LICENSE = "LGPL-2.1-or-later"

PV = "9"

RPM_NAME = "libluksmeta-devel-9-1.1.aarch64.rpm"
RPM_HASH = "7b56666e86c9432ede8c287f10482a7809f456feff56f83c6c386d564a74911cafd5bb9e8c494e435bc0026b21701523885738a9b4be4b5a4277ab73de3a71cc"

RPROVIDES:${PN} += "libluksmeta-devel \
libluksmeta-devel(aarch-64) \
pkgconfig(luksmeta)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libluksmeta0 \
pkgconfig(libcryptsetup)"

inherit rpm
