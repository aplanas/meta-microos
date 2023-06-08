SUMMARY = "Qt6 QmlTypeRegistrar static library"
DESCRIPTION = "The Qt6 QmlTypeRegistrar static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-qmltyperegistrar-devel-static-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "e41f1c8cd429bc34df83dca54d6d136ff5fae12676e61ec80f1d823459b3caad153b35c5a74000df558d738af41ea51e2b80e7afee55a1196cb1c5ef2c39fb58"

RPROVIDES:${PN} += "cmake(Qt6QmlTypeRegistrarPrivate) qt6-qmltyperegistrar-devel-static qt6-qmltyperegistrar-devel-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
