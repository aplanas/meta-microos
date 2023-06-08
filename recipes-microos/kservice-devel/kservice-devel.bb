SUMMARY = "Plugin framework for desktop services: Build Environment"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kservice-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "ead4cd10fe6a7063591a846650f5104e0406849507a0d0a7e70d1572cafde289fb4a2a324ab0394d0b8f5d99dabb2ee3dc6ac004a1168650659f9eacab91a99d"

RPROVIDES:${PN} += "cmake(KF5Service) kservice-devel kservice-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5CoreAddons) extra-cmake-modules kservice"

inherit rpm
