SUMMARY = "Non-ABI stable API for the Qt 6 QuickControls2 library"
DESCRIPTION = "This package provides private headers of libQt6QuickControls2 that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-quickcontrols2-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "5fc82e13076a071b3872cd3c4123638cda49a8beb4413bcce22fceba191fa875950c38d144266f048303330657a70eca20ef80c9ae4ae1a2df6932cb2c3f9147"

RPROVIDES:${PN} += "qt6-quickcontrols2-private-devel qt6-quickcontrols2-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QuickControls2)"

inherit rpm
