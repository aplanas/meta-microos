SUMMARY = "Non-ABI stable API for the Qt 6 QmlLocalStorage library"
DESCRIPTION = "This package provides private headers of libQt6QmlLocalStorage that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmllocalstorage-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "ce5133e704e7f5284d13e816437d081d6a8aa45896e59cda0d1ebd4110fd41855560eb2c0b560a77a877682d8fcc891eb1245a75211857c67143886833ecc99c"

RPROVIDES:${PN} += "qt6-qmllocalstorage-private-devel qt6-qmllocalstorage-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6QmlLocalStorage) qt6-core-private-devel qt6-qml-private-devel"

inherit rpm
