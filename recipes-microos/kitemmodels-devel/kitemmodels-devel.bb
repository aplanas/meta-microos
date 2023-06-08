SUMMARY = "Set of item models extending the Qt model-view framework"
DESCRIPTION = "KItemModels provides a set of item models extending the Qt model-view framework. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kitemmodels-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "7a71e76fcc0b22c681353d3a892ae6641e23ca585fd85ce28575430585ea6ff08b0175dd454d0d7089990e4663b4a43ff4944378803ae75f82184ff961b30ed8"

RPROVIDES:${PN} += "cmake(KF5ItemModels) kitemmodels-devel kitemmodels-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5ItemModels5"

inherit rpm
