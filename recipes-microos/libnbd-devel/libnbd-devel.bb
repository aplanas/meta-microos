SUMMARY = "Development headers for libnbd"
DESCRIPTION = "This package contains development headers for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libnbd-devel-1.14.1-2.1.aarch64.rpm"
RPM_HASH = "7e9b193c04de1358ec8c0c334834639dd9e3f9bb0ba50705d66cdd0395fd29843705cffa5ec4c0722623a6126b4c4564eff7228e586042294126d2b0bfc5931f"

RPROVIDES:${PN} += "libnbd-devel libnbd-devel(aarch-64) pkgconfig(libnbd)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnbd0"

inherit rpm
