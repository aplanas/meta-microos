SUMMARY = "Qt 6 Declarative meta package"
DESCRIPTION = "This meta-package requires all the qt6-declarative development packages."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-declarative-devel-6.5.1-1.2.noarch.rpm"
RPM_HASH = "f7350d3637550917e04a9fa7f693b1c7993340193dacb2a3e281d5d6600272fa1cfebb2edc53f29b29ea1405e0607ec9f7ba42e0c1ed6e0597d42032ff9ef06e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-declarative-devel"
RDEPENDS:${PN} += "cmake(Qt6Qml) cmake(Qt6QmlCore) cmake(Qt6QmlLocalStorage) cmake(Qt6QmlModels) cmake(Qt6QmlWorkerScript) cmake(Qt6Quick) cmake(Qt6QuickControls2) cmake(Qt6QuickControls2Impl) cmake(Qt6QuickDialogs2) cmake(Qt6QuickDialogs2QuickImpl) cmake(Qt6QuickDialogs2Utils) cmake(Qt6QuickLayouts) cmake(Qt6QuickTemplates2) cmake(Qt6QuickTest) cmake(Qt6QuickWidgets)"

inherit rpm
