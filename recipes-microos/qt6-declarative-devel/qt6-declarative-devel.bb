SUMMARY = "Qt 6 Declarative meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-declarative-devel-6.5.0-2.1.noarch.rpm"
RPM_HASH = "35e70bca8d299bc68e8a22ab490f910ead4478b8fa58445f69f526b71346990530dcb429257137f5001c140f63b4020bbee933beeea62f5ae1b1533814ec10ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-devel"
RDEPENDS:${PN} += "cmake(Qt6Qml) cmake(Qt6QmlCore) cmake(Qt6QmlLocalStorage) cmake(Qt6QmlModels) cmake(Qt6QmlWorkerScript) cmake(Qt6Quick) cmake(Qt6QuickControls2) cmake(Qt6QuickControls2Impl) cmake(Qt6QuickDialogs2) cmake(Qt6QuickDialogs2QuickImpl) cmake(Qt6QuickDialogs2Utils) cmake(Qt6QuickLayouts) cmake(Qt6QuickTemplates2) cmake(Qt6QuickTest) cmake(Qt6QuickWidgets)"

inherit rpm
