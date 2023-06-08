SUMMARY = "Additional plasmoid widgets - development files"
DESCRIPTION = "This package contains development files to develop additional widgets for \
the Plasma desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-addons-devel-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "296dfbd6b980c8a10071c3b2c1c21c014ad130b64bb4bea9085dc4cdaf2fd51b0f0b66b1d5e8210c8425533d6ee34bd74a840fff18dca82d68ae9dd1d076a101"

RPROVIDES:${PN} += "cmake(PlasmaPotdProvider) plasma5-addons-devel plasma5-addons-devel(aarch-64)"
RDEPENDS:${PN} += "plasma5-addons"

inherit rpm
