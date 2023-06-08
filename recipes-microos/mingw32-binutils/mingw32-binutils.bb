SUMMARY = "GNU Binutils"
DESCRIPTION = "The GNU Binutils are a collection of binary tools. \
These utilities (like 'as', 'ld', 'strip') understand Windows executables and DLLs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-binutils-2.39-4.3.noarch.rpm"
RPM_HASH = "a07184f63e737d543697d4c4f6bce6d3f0faaaa097925640b532061e2d913f77531386c21760098eaf4e61abf8feb92d35104dcde884bbe3fb85c34d95b10b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(libdep.dll) mingw32-binutils"
RDEPENDS:${PN} += ""

inherit rpm
