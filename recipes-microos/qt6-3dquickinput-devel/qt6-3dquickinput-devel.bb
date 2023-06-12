SUMMARY = "Development files for the Qt 6 3DQuickInput library"
DESCRIPTION = "Development files for the Qt 6 3DQuickInput library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-3dquickinput-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "58b560c0a017d53ceb2318e8ea6a872aa433859bfba6132aa84fe91ff329a668fb326a42b4d56eccb759034a1fd08ba941a29e4e201813c0c0eec46120fc8e8f"

RPROVIDES:${PN} += "cmake(Qt63DQuickInput) pkgconfig(Qt63DQuickInput) qt6-3dquickinput-devel qt6-3dquickinput-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt63DCore) cmake(Qt63DInput) cmake(Qt63DQuick) cmake(Qt6Gui) cmake(Qt6Qml) libQt63DQuickInput6 pkgconfig(Qt63DCore) pkgconfig(Qt63DInput) pkgconfig(Qt63DQuick) pkgconfig(Qt6Core) pkgconfig(Qt6Gui) pkgconfig(Qt6Qml)"

inherit rpm
