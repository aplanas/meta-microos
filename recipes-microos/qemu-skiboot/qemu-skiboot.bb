SUMMARY = "OPAL firmware (aka skiboot), used in booting OpenPOWER systems"
DESCRIPTION = "Provides OPAL (OpenPower Abstraction Layer) firmware, aka skiboot, as \
traditionally packaged with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "7.1.0"

RPM_NAME = "qemu-skiboot-7.1.0-16.1.noarch.rpm"
RPM_HASH = "21c68d92014dedda07d4f518dd823d619ef51c78a3c2eb973d8f7360adc13f6f549ce090abdb40bd692df1281719874e556e5f8b83474335cb8e44bff39dd84a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-skiboot"
RDEPENDS:${PN} += "/bin/sh update-alternatives"

inherit rpm
