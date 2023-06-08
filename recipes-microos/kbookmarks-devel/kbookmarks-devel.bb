SUMMARY = "Development files for kbookmarks, a XBEL format bookmark manipulation framework"
DESCRIPTION = "Development files for kbookmarks, a framework for accessing and \
manipulating bookmarks using the XBEL format"
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kbookmarks-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "729737bb8e55fdea1c9615f9d10b89838e524542eeaa2afa32b8c9ba279a69e5a057c04ea1012fcad335bb8dba21390f41f7a1d6abc989c99871733f1b7db9c5"

RPROVIDES:${PN} += "cmake(KF5Bookmarks) kbookmarks-devel kbookmarks-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5WidgetsAddons) cmake(Qt5Widgets) cmake(Qt5Xml) extra-cmake-modules libKF5Bookmarks5"

inherit rpm
