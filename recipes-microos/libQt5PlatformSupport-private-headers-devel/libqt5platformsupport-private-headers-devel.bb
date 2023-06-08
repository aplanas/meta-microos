SUMMARY = "Non-ABI stable experimental API for the  Qt5 platform support library"
DESCRIPTION = "This package provides private headers of libQt5PlatformSupport that \
are normally not used by application development and that do not have \
any ABI or API guarantees. The packages that build against these have \
to require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5PlatformSupport-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "430e4911de4dd57ffbaed671678f9aa131ca500f65fd87596a18ebf0ed6a4bca68bcc389a65172b34566e2623335e0728114c44dc25f4cb90de43d314fa184f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PlatformSupport-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Gui-private-headers-devel libQt5PlatformSupport-devel-static"

inherit rpm
