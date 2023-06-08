SUMMARY = "Development files for the Qt 6 Quick3DGlslParser library"
DESCRIPTION = "Development files for the Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dglslparser-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "39e080a45d47c0897b3fa4ffe710efc317e7736c9247ab0d5199a1e18dc3b42e6656f1dd6a8585767472f182cdf2abf92a9433b4373f9818c274a5bd92270833"

RPROVIDES:${PN} += "cmake(Qt6Quick3DGlslParserPrivate) qt6-quick3dglslparser-private-devel qt6-quick3dglslparser-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core) libQt6Quick3DGlslParser6"

inherit rpm
