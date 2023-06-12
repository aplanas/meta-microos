SUMMARY = "Non-ABI stable API for the Qt 6 3DAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3danimation-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "2eacf02aaa1aae5f80baddcd1d6df44aae3d1c6c14c40dcd8a916a68043a2192c5c849ef6fef7d3de133cc6b352666e923265ae41047ee9071a6e53df470dc06"

RPROVIDES:${PN} += "qt6-3danimation-private-devel qt6-3danimation-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DAnimation)"

inherit rpm
