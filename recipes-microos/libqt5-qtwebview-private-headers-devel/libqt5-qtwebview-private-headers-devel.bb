SUMMARY = "Non-ABI stable experimental API for Qt5's Webview library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebview that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtwebview-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "04930d54ccab2f1812ee5ff53af5e6187e242de3988cec5ce212a6bebba91d5d4996b61aa872e63eef39528cb54da75bbcaaa9233a204131b8b4937606dacdb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebview-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtwebview-devel"

inherit rpm
