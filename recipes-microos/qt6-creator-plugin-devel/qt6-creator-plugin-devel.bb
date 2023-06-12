SUMMARY = "Qt Creator Plugin Development Files"
DESCRIPTION = "This package contains all files from the Qt Creator source directory \
(aka QTC_SOURCE) necessary to compile plugins."
LICENSE = "BSD-3-Clause & GPL-3.0-only & GPL-3.0-with-Qt-Company-Qt-exception-1.1 & (LGPL-2.1-only | LGPL-3.0-only) & LGPL-3.0-only"

PV = "10.0.1"

RPM_NAME = "qt6-creator-plugin-devel-10.0.1-2.2.aarch64.rpm"
RPM_HASH = "24b67a7838f31e654019db856ce3e131984d94af0b535d909ebecb55aebb02db523ecbf5ad3c0c0c2168cbfcc818c25d7fad99cf5525dcfb9cb263282d14b24a"

RPROVIDES:${PN} += "cmake(QtCreator) \
libqt5-creator-plugin-devel \
qt5-creator-plugin-devel \
qt6-creator-plugin-devel \
qt6-creator-plugin-devel(aarch-64)"
RDEPENDS:${PN} += "qt6-base-devel \
qt6-creator"

inherit rpm
