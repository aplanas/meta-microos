SUMMARY = "Documentation for the ICU library"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode \
and locale support. \
This package contains the HTML documentation."
LICENSE = "ICU"

PV = "72.1"

RPM_NAME = "libicu-doc-72.1-2.3.aarch64.rpm"
RPM_HASH = "eb81a9e66490b01f3ed9ec52e3791fdf821b67998861039b1850ccd990536f2e62563f803e581f59753da929d2c7c650969b6803b933b731954e96f00b4d5821"

RPROVIDES:${PN} += "libicu-doc libicu-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
