SUMMARY = "Fuzzy logic toolkit for Octave"
DESCRIPTION = "A mostly MATLAB-compatible fuzzy logic toolkit. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.6"

RPM_NAME = "octave-forge-fuzzy-logic-toolkit-0.4.6-1.9.noarch.rpm"
RPM_HASH = "e4a84a3c9c4288f6827b4841471cdda22bc642135d0140fce882175f478b548ebbca2327fd6f6461e27893648b2de6a18dcc094d72d61b90bd7b5209b39c05db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-forge-fuzzy-logic-toolkit"
RDEPENDS:${PN} += "/bin/sh \
octave-cli"

inherit rpm
