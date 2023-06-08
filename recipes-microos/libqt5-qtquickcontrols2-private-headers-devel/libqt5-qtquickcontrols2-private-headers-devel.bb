SUMMARY = "Headers for the unstable API of the Qt5 QuickControls2 module"
DESCRIPTION = "You need this package if you want to compile programs against the unstable API \
of the Qt5 QuickControls 2 module."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtquickcontrols2-private-headers-devel-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "f5f5f41c4261d32fb99be0a4791a0098c8458c22c8ce876a50a71f6c66fadaa2d25219721baa49df603ded50353e9687f35234dc475cadb783b12d19851b49ae"

RPROVIDES:${PN} += "libqt5-qtquickcontrols2-private-headers-devel libqt5-qtquickcontrols2-private-headers-devel(aarch-64)"
RDEPENDS:${PN} += "libQt5QuickControls2-devel libQt5QuickTemplates2-devel"

inherit rpm
