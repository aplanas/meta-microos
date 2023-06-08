SUMMARY = "Qt Creator Plugin Development Files"
DESCRIPTION = "This package contains all files from the Qt Creator source directory \
(aka QTC_SOURCE) necessary to compile plugins."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "10.0.1"

RPM_NAME = "qt6-creator-plugin-devel-10.0.1-1.1.aarch64.rpm"
RPM_HASH = "e8a4be8c12e99468ca7b8bac369b42074074871b496ed0eb24eec42dc4b66a4fda5fdba76b08d0b314f6960bde5ad2b08cb8db2fe27de5861d4e321389d512f7"

RPROVIDES:${PN} += "cmake(QtCreator) libqt5-creator-plugin-devel qt5-creator-plugin-devel qt6-creator-plugin-devel qt6-creator-plugin-devel(aarch-64)"
RDEPENDS:${PN} += "qt6-base-devel qt6-creator"

inherit rpm
