SUMMARY = "Non-ABI stable API for the Qt 6 3DQuickExtras library"
DESCRIPTION = "This package provides private headers of libQt63DQuickExtras that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3dquickextras-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "df6e99b0b6cc5128abcd6ed8526c117c3fc9aa241ce29fa1c175237904a79bb0d2c1ab0bfaa32d511eb68e9ce4188d70dec25f0b7a392d87e6ca54996878b951"

RPROVIDES:${PN} += "qt6-3dquickextras-private-devel qt6-3dquickextras-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DQuickExtras)"

inherit rpm
