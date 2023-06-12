SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python311-pygame-devel-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "59d44e048c8b53fb1456341413a0e2a501346ad9b5589945240526beaa1703693ece1e21c9bf5142645f76bd970376300cc758dc5872bf196809716b13ba80e4"

RPROVIDES:${PN} += "python311-pygame-devel \
python311-pygame-devel(aarch-64)"
RDEPENDS:${PN} += "python311-pygame"

inherit rpm
