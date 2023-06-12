SUMMARY = "C interface to suseconnect-ng"
DESCRIPTION = "This package contains library which provides C interface to selected \
suseconnect-ng functions."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0~git0.e3c41e60892e"

RPM_NAME = "libsuseconnect-1.1.0~git0.e3c41e60892e-1.2.aarch64.rpm"
RPM_HASH = "b67b9a56f95e531e1cf5d9c811fda2bccd83d0b9563c6baa8b6f7c3049e1d3342ba5727055d1640fdaf89ac8f3dedaff803eda76882dfb75e77e016fc7350edc"

RPROVIDES:${PN} += "libsuseconnect \
libsuseconnect(aarch-64)"
RDEPENDS:${PN} += "suseconnect-ng"

inherit rpm
