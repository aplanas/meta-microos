SUMMARY = "Non-ABI stable API for the Qt 6 3DAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3danimation-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "14afdfeb876e356c809a47db811d196649900cfe61e83c60508efede673aaf324ee1b5f515912a669fd39d51deabc887150ec11d65c0e3bddce8dc7181e4271b"

RPROVIDES:${PN} += "qt6-3danimation-private-devel qt6-3danimation-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DAnimation)"

inherit rpm
