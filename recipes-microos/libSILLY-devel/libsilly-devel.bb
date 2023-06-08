SUMMARY = "Simple Image Loading LibrarY development package"
DESCRIPTION = "Development files for libSILLY \
SILLY means Simple Image Loading LibrarY. The aim of this library is to provide \
a simple library for loading image in the context of CEGUI. The library supports \
only the most common image format. The project was initially launch in order \
to provide an MIT based replacement of DevIL with less image format supported \
and focused on loading image only."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "libSILLY-devel-0.1.0-1.8.aarch64.rpm"
RPM_HASH = "219d7b192e597a18b922206c538e2b71ff1ab0fa7cb3ddb0804b2d7b1518135609fee65fa190b8d78f8868c22902828275f4217f69fa24651747b9c832ba967a"

RPROVIDES:${PN} += "libSILLY-devel libSILLY-devel(aarch-64) pkgconfig(SILLY)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libSILLY1"

inherit rpm
