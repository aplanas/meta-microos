SUMMARY = "Non-ABI stable experimental API for the Qt5 widgets library"
DESCRIPTION = "This package provides private headers of libQt5Widgets that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Widgets-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "d00fd9c4cd60ec3df64e72cf1adfbf820819b33551db4abac95f6f3fc7e0bf9396478f1e0e01074a1e36b99c3769658149c7bd0d537d0d94b66add9560878e18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Widgets-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5Widgets-devel"

inherit rpm
