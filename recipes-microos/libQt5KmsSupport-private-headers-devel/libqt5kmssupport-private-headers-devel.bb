SUMMARY = "Non-ABI stable experimental API for the Qt5 KMS support library"
DESCRIPTION = "This package provides private headers of libQt5KmsSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5KmsSupport-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "d518d479d77b36dfd3af1e6efe5c2b840bb8ead080ca725adbf47cb7dca7f230fd49893316fbab79a817f6c4d354b2b0a23d9f5bfe66c55f35d65e17194f21a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5KmsSupport-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5KmsSupport-devel-static"

inherit rpm
