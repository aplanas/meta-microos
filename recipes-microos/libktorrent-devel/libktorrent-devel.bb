SUMMARY = "Development files for libktorrent"
DESCRIPTION = "This package includes the necessary files for development using libktorrent."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libktorrent-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "34fe94997539b95883a1428083d1b7d2f0e4ace1d1d2011119ed55dd50694a44439d5820c6758d03ca66d6b90cf638826b456e5266bc9a0060c0225e7c7cb68d"

RPROVIDES:${PN} += "cmake(KF5Torrent) libktorrent-devel libktorrent-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Archive) cmake(KF5Config) cmake(KF5KIO) cmake(Qca-qt5) cmake(Qt5Core) cmake(Qt5Network) gmp-devel libKF5Torrent6 libboost_headers-devel libgcrypt-devel"

inherit rpm
