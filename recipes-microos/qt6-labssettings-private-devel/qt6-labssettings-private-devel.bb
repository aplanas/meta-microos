SUMMARY = "Non-ABI stable API for the Qt 6 LabsSettings library"
DESCRIPTION = "This package provides private headers of libQt6LabsSettings that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-labssettings-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "e8da608e03914c71f07edd5c28a4cc1a427441c71debaf778a0396932cfa2a6090ee84d39bc35b7d71524c4229f2baeab2807e83cacde779e4eb4e99c4ac1964"

RPROVIDES:${PN} += "qt6-labssettings-private-devel \
qt6-labssettings-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsSettings)"

inherit rpm
