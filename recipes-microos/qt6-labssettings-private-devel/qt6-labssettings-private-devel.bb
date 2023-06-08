SUMMARY = "Non-ABI stable API for the Qt 6 LabsSettings library"
DESCRIPTION = "This package provides private headers of libQt6LabsSettings that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labssettings-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "5b9a9e14c1d31803723d7a70fd346089b7db9fb27ce4bf6b4dd3767fda313f83d42a19fc7416e75b2d1f6096aa7e81b1b146a35811746d5538bf7e8374f1f382"

RPROVIDES:${PN} += "qt6-labssettings-private-devel qt6-labssettings-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsSettings)"

inherit rpm
