SUMMARY = "Plugin framework for desktop services: Build Environment"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kservice-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "839866c1dd748a7782c59f3e8e374a06884456d14ca0a403fa8cb444d0a10a9b691de59d94a12d16092b8217bee481650f4d023074eaa0db741991664e594680"

RPROVIDES:${PN} += "cmake(KF5Service) kservice-devel kservice-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5CoreAddons) extra-cmake-modules kservice"

inherit rpm
