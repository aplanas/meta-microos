SUMMARY = "Non-ABI stable API for the Qt 6 Positioning Library"
DESCRIPTION = "This package provides private headers of libQt6Positioning that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-positioning-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "bfe97e9d99c94ee71aa8b86ad739daa2d758c6c23f15aaee76433721e878f9803bc4dbb5deeddfde4f44601d02d22df39f9e008598dc8aa12526baddb5e3b360"

RPROVIDES:${PN} += "qt6-positioning-private-devel qt6-positioning-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Positioning)"

inherit rpm
