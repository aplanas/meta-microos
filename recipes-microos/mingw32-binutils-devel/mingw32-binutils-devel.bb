SUMMARY = "GNU Binutils"
DESCRIPTION = "libbfd, libiberty and libopcodes.a"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-binutils-devel-2.39-4.3.noarch.rpm"
RPM_HASH = "b7a7283651034ee38deb77fd1626ba57fc68f7a2d77b05e3fb0267a6df4c2dde512497aa2623e14562205e8e149ba93cb3fe70b38c299902e10fac38a477feca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(lib:bfd) mingw32(lib:ctf) mingw32(lib:ctf-nobfd) mingw32(lib:iberty) mingw32(lib:opcodes) mingw32-binutils-devel"
RDEPENDS:${PN} += ""

inherit rpm
