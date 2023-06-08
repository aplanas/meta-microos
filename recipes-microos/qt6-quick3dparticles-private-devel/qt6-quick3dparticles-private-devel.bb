SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DParticles library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DParticles that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-quick3dparticles-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b87ec5c72adc6ddbece0094b777d34999687defd61db5f9292ce1042ca123ab052c3c19d6e8089117a478c3c156467b3e27e48087c4090dd252f21f7186a03b2"

RPROVIDES:${PN} += "qt6-quick3dparticles-private-devel qt6-quick3dparticles-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Quick3DParticles)"

inherit rpm
