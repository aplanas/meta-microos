SUMMARY = "Non-ABI stable API for the Qt 6 QmlModels library"
DESCRIPTION = "This package provides private headers of libQt6QmlModels that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmlmodels-private-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "907604ac788375ad2435bfcb7ce9c598dc90ce9db9107f23d0ab527444ac232862d9aae4dd72ce4d666507362a974ebcf10e8ca9923739c72aeaf1189bc171b6"

RPROVIDES:${PN} += "qt6-qmlmodels-private-devel qt6-qmlmodels-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlModels) qt6-core-private-devel qt6-qml-private-devel"

inherit rpm
