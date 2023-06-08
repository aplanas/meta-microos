SUMMARY = "Qt 6 WlShellIntegration library - Development files"
DESCRIPTION = "Development files for the Qt 6 WlShellIntegration library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-wlshellintegration-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "761520d762bd3cef9b82b64522bdd0574de8163bbbc852c21ea8f9de07710930da06f648a7bcc4b6b44ed9f8c52923202880532fe93aef556d160ace4db704f0"

RPROVIDES:${PN} += "cmake(Qt6WlShellIntegrationPrivate) qt6-wlshellintegration-private-devel qt6-wlshellintegration-private-devel(aarch-64)"
RDEPENDS:${PN} += "libQt6WlShellIntegration6 qt6-gui-private-devel qt6-waylandclient-private-devel"

inherit rpm
