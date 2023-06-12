SUMMARY = "OPAL firmware (aka skiboot), used in booting OpenPOWER systems"
DESCRIPTION = "Provides OPAL (OpenPower Abstraction Layer) firmware, aka skiboot, as \
traditionally packaged with QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "8.0.2"

RPM_NAME = "qemu-skiboot-8.0.2-1.1.noarch.rpm"
RPM_HASH = "a0d915343f5e368296c16260d793bb2f6da4254d35ef3eb983fd470924f2aa6432f10926039240f17607efe1e95e8e1f98e5529ef387c0f1aa6852879d5e1598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qemu-skiboot"
RDEPENDS:${PN} += "/bin/sh update-alternatives"

inherit rpm
