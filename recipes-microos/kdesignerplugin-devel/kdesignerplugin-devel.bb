SUMMARY = "Build environment for kdesignerplugin, a framework for integration of KDE frameworks widgets"
DESCRIPTION = "This framework provides plugins for Qt Designer that allow it to display \
the widgets provided by various KDE frameworks, as well as a utility \
(kgendesignerplugin) that can be used to generate other such plugins \
from ini-style description files. Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdesignerplugin-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "be534c6b31f897d838fe6be8c0b6f493929de132d4a3691ba7e9b3fe9d262026407e8eae37a277017d8829bc275693a838190339711ddd2e1b8479f080b4eb5b"

RPROVIDES:${PN} += "cmake(KF5DesignerPlugin) kdesignerplugin-devel kdesignerplugin-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules kdesignerplugin"

inherit rpm
