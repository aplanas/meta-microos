SUMMARY = "Base package of KDE PIM PimCommon library"
DESCRIPTION = "This package contains the pimcommon library, used by several KDE PIM \
applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "pimcommon-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "6ac62f27e10387ec08c6f25e6650238f1e67d2622e1bed2970ab75545f6cdfdb0b1473ee5222fa95b968f5e768dc64b7ffec33675cc0d85490025db68e002d3a"

RPROVIDES:${PN} += "pimcommon \
pimcommon(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
