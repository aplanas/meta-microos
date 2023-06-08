SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickRender library"
DESCRIPTION = "This package provides private headers of libQt63DQuickRender that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickrender-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "ed27eb7feb1b6ed2970b95b62b022454846c2689909a9712d8f1519a339f9bf9c759d2da9120a43e1a334f07f88a7bce6089f314dac3b9720dfe681903b67fbb"

RPROVIDES:${PN} += "qt6-3dquickrender-private-devel qt6-3dquickrender-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuickRender)"

inherit rpm
