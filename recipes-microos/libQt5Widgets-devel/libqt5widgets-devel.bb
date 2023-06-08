SUMMARY = "Development files for the Qt5 widgets library"
DESCRIPTION = "Development files for the Qt5 widgets library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Widgets-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "d19d91ac6908060e490f744506d8a8bcc4faade9519fe6de83f5084a80b92c15add564a5a9860e9c7e0cb4326edc4b99388d09fd7af1ebb146c964bea77693c5"

RPROVIDES:${PN} += "cmake(Qt5Widgets) libQt5Widgets-devel libQt5Widgets-devel(aarch-64) pkgconfig(Qt5Widgets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libQt5Core-devel libQt5Gui-devel libQt5Widgets5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui)"

inherit rpm
