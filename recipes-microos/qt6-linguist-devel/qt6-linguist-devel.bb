SUMMARY = "Qt 6 linguist tools - Development files"
DESCRIPTION = "Development files for the Qt 6 linguist tools."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-linguist-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "29374d1ecf3593285319a72db6e62d93095c5d816a7339440e132b36dde65f218cd989d8f38250725f1a484f8af0082c1792871ad7f64a591adbdfb74f6765f8"

RPROVIDES:${PN} += "cmake(Qt6Linguist) cmake(Qt6LinguistTools) pkgconfig(Qt6Linguist) qt6-linguist-devel qt6-linguist-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config qt6-tools-linguist"

inherit rpm
