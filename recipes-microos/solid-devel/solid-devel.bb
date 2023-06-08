SUMMARY = "KDE Desktop hardware abstraction: Build Environment"
DESCRIPTION = "Solid is a device integration framework.  It provides a way of querying and \
interacting with hardware independently of the underlying operating system. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "solid-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "c0c15621cdf272de3462948a989a5468e11ced0674b5dd894b02e80f67686e14dad2ca57a7a03a43912de0a7965b64919638facd64632efad03ddb9d9657204b"

RPROVIDES:${PN} += "cmake(KF5Solid) solid-devel solid-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5Solid5"

inherit rpm
