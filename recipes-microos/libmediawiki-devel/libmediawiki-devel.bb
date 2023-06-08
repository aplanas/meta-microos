SUMMARY = "Development files for libmediawiki"
DESCRIPTION = "libmediawiki is a KDE C++ interface for MediaWiki based web services as \
wikipedia.org. \
 \
This package contains the development files for libmediawiki."
LICENSE = "GPL-2.0-or-later"

PV = "5.38.0"

RPM_NAME = "libmediawiki-devel-5.38.0-1.3.aarch64.rpm"
RPM_HASH = "ecb36f24c5a6b5e55b0541311681bab3134f0d2fd6a029827119641005c1e6751350e6e084ad71ad6fd5153ab18c801ecf39d5c4a7ad0453b9c6414eeca5800d"

RPROVIDES:${PN} += "cmake(KF5MediaWiki) libmediawiki-devel libmediawiki-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(Qt5Core) cmake(Qt5Network) libKF5MediaWiki5"

inherit rpm
