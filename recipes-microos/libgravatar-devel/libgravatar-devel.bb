SUMMARY = "Development package for libgravatar"
DESCRIPTION = "The development package for the libgravatar library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libgravatar-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "bf2217d4fff4eaa8c9d1cdc1b25eb9efc98b1ade30f2b4426bfc95a6eb695a476aef691c85b47af705b2b7c3d0e5a5d66c1e32e882177fec4c994935ed128e66"

RPROVIDES:${PN} += "cmake(KF5Gravatar) cmake(KPim5Gravatar) libgravatar-devel libgravatar-devel(aarch-64)"
RDEPENDS:${PN} += "libKPim5Gravatar5"

inherit rpm
