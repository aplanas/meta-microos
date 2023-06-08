SUMMARY = "Pygame documentation and example programs"
DESCRIPTION = "This package contains documentation and example programs for Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python-pygame-doc-2.1.3-1.4.aarch64.rpm"
RPM_HASH = "4c8dbbcb8c7cbc3c65ceb2f552c5c67c08d2fc2750020ece26973ae82cd942d883d320c1c5836e4edf04ce8a612be73e5aa23289a24b03506e14da1c03592220"

RPROVIDES:${PN} += "pygame-doc python-pygame-doc python-pygame-doc(aarch-64) python310-pygame-doc python311-pygame-doc python39-pygame-doc"
RDEPENDS:${PN} += ""

inherit rpm
