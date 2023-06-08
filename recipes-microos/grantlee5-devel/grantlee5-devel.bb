SUMMARY = "Include Files and Libraries Mandatory for Development with Grantlee"
DESCRIPTION = "This package contains include files and libraries needed for development with \
grantlee."
LICENSE = "LGPL-2.1-or-later"

PV = "5.3.1"

RPM_NAME = "grantlee5-devel-5.3.1-1.3.aarch64.rpm"
RPM_HASH = "a5c6e333a87d016c04a245da82e2a0969b56a354dbf0430206f4d5027e852eefa23b622570e15994057644a0f475e0ad089c1251605fe7c558a03bd6b345ac52"

RPROVIDES:${PN} += "cmake(Grantlee5) grantlee5-devel grantlee5-devel(aarch-64)"
RDEPENDS:${PN} += "cmake cmake(Qt5Core) cmake(Qt5Gui) grantlee5"

inherit rpm
