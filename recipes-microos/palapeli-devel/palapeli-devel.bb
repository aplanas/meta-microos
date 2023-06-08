SUMMARY = "Development package for Palapeli"
DESCRIPTION = "This package contains the development files for Palapeli."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "palapeli-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e7fcd9fbd77d3e6c6852f12e58e4a41914c3da3e739e7c22ec657f5ff2820cdec611b56b96471995892d16e3fe7425f9596773640c471b553df7e28df7297490"

RPROVIDES:${PN} += "cmake(Pala) palapeli-devel palapeli-devel(aarch-64)"
RDEPENDS:${PN} += "palapeli"

inherit rpm
