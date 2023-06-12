SUMMARY = "Qt 6 QuickParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickparticles-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "6f9a5cc65422a3397bb68b862eca3631329e09ab21a8aaace6cf40d012e2dc0c6371e612433462091d97add8e0effdceac29a3e0abbbce0ba784f24dbbb42c19"

RPROVIDES:${PN} += "cmake(Qt6QuickParticlesPrivate) \
qt6-quickparticles-devel \
qt6-quickparticles-private-devel \
qt6-quickparticles-private-devel(aarch-64)"
RDEPENDS:${PN} += "libQt6QuickParticles6 \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
