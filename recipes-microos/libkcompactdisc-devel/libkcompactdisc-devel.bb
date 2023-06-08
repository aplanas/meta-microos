SUMMARY = "Development files for the KDE CD drive library"
DESCRIPTION = "This package contains the development headers for libkcompactdisc."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkcompactdisc-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "a6b208ffd493ec7cb427eee7de8a56ce43fd9c247e7c22a22764dcd37acb0c02f736e94381aaef4c8692048b872b42d7d391b249172812ea118163d25693ab81"

RPROVIDES:${PN} += "cmake(KF5CompactDisc) libkcompactdisc-devel libkcompactdisc-devel(aarch-64)"
RDEPENDS:${PN} += "libKF5CompactDisc5"

inherit rpm
