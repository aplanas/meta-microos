SUMMARY = "Developer documentation for csync"
DESCRIPTION = "The libcsync-devel-doc package provides documentation for csync \
development."
LICENSE = "GPL-2.0-or-later"

PV = "0.50.0"

RPM_NAME = "libcsync-devel-doc-0.50.0-11.9.aarch64.rpm"
RPM_HASH = "5bf42ca3d54a454351b8da0f0a692fec15d272ba617887e7a49753ad806d2ffca206cc8b222d48258152211dddfcea27f3ad3267f8d72daf45e84c05b43284f0"

RPROVIDES:${PN} += "libcsync-devel-doc libcsync-devel-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
