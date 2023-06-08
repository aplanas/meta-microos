SUMMARY = "Non-ABI stable API for the Qt 6 QuickTest library"
DESCRIPTION = "This package provides private headers of libQt6QuickTest that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quicktest-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "90b9c8293c853455915218991725c38f6879def498ea59c725e16faec3cff8528d68d55184b0f637e41512bfa6805e0679aed3dc4eeec032e15299be8795d31e"

RPROVIDES:${PN} += "qt6-quicktest-private-devel qt6-quicktest-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickTest) qt6-test-private-devel"

inherit rpm
