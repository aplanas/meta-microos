SUMMARY = "Non-ABI stable experimental API for the Qt5 widgets library"
DESCRIPTION = "This package provides private headers of libQt5Widgets that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Widgets-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "4b6d512b0af2f37cc8bb1f7aecee945f6338bb81ca4380e8c11247e8480faf002ab4c177cf6d8c7ba665c5436efc5ee8147091c20a48bf71c1b3f111067fa0b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Widgets-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5Widgets-devel"

inherit rpm
