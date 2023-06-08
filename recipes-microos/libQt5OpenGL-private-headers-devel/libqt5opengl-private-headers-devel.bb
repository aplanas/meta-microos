SUMMARY = "Non-ABI stable experimental API for the Qt5 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt5OpenGL that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5OpenGL-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "504ca6cf1da19e54d0d83cad04e54ce34491dfdb8b2f793ff726a762c07e6e42d131711b96bbfd818f6f9cb3361f7a6ea214f420d0641eeda1054c64f9e4624f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5OpenGL-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5OpenGL-devel libQt5Widgets-private-headers-devel"

inherit rpm
