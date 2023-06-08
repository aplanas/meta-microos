SUMMARY = "Qt Bootstrap module"
DESCRIPTION = "Qt Bootstrap module."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Bootstrap-devel-static-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "bd2eb473373acebeb8d0052d1e2b9db516103210214741a9c9d0034dcd47ccba1fca682e54cd07d892f323ff1fec93366a925717cc474b68aeba484c9de14d9d"

RPROVIDES:${PN} += "libQt5Bootstrap-devel-static libQt5Bootstrap-devel-static(aarch-64)"
RDEPENDS:${PN} += "libqt5-qtbase-common-devel"

inherit rpm
