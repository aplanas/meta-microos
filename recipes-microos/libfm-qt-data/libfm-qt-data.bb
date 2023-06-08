SUMMARY = "Data files for libfm library"
DESCRIPTION = "Provides data to be read by libfm-qt"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "libfm-qt-data-1.3.0-1.2.noarch.rpm"
RPM_HASH = "7f576507bf448e9fa633e29ff402c33c9a68af076c4db13a085d7b3c795631ca6fc7705b472d2741d6adb795ee006fc2185bca2847510e038eaf63bdf32fca9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-qt-data"
RDEPENDS:${PN} += ""

inherit rpm
