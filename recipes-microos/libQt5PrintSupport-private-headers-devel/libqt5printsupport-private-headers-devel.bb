SUMMARY = "Non-ABI stable experimental API for the Qt5 print support library"
DESCRIPTION = "This package provides private headers of libQt5PrintSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5PrintSupport-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "a94574924d77e090d210ae83ed215f1e64dcb2706f6bb088402ccf23d117dcd50f627f455e82b324d7e96c8a371e30d99e18c1ca497a5f368e663ea0351f4f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PrintSupport-private-headers-devel"
RDEPENDS:${PN} += "cups-devel libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5PrintSupport-devel libQt5Widgets-private-headers-devel"

inherit rpm
