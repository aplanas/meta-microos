SUMMARY = "Non-ABI stable API for the Qt 6 WebChannel library"
DESCRIPTION = "This package provides private headers of libQt6WebChannel that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-webchannel-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "6118fe0adf14d6d22418c1e1fc4f320e124775934ca381d749b07810991cc8844e9f39dc8ee8eaf6875c193fc255f2956c914aaf04b642770343e2c8d3a47480"

RPROVIDES:${PN} += "qt6-webchannel-private-devel qt6-webchannel-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6WebChannel) qt6-core-private-devel"

inherit rpm
