SUMMARY = "Non-ABI stable API for the Qt 6 LabsAnimation library"
DESCRIPTION = "This package provides private headers of libQt6LabsAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-labsanimation-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "6e0932ad09db8061821b176446fbf1a1eee58723626b4a805010bc92dfe04c7192af3b2fc43a0d58847b3deead939eeb539e864c34cf74aeb21ce28f0125f71d"

RPROVIDES:${PN} += "qt6-labsanimation-private-devel qt6-labsanimation-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6LabsAnimation)"

inherit rpm
