SUMMARY = "Development files for jimtcl"
DESCRIPTION = "The jimtcl-devel package contains libraries and header files for \
developing applications that use jimtcl."
LICENSE = "BSD-2-Clause"

PV = "0.81"

RPM_NAME = "jimtcl-devel-0.81-1.3.aarch64.rpm"
RPM_HASH = "939490e446e7261de7a6782e571e954f7b0cf4351cd264eccee79012e563e2abf6035c1162993b5b2494097721ea6e032040e4b1116777128dadab9fdbba3cbc"

RPROVIDES:${PN} += "jimtcl-devel \
jimtcl-devel(aarch-64) \
pkgconfig(jimtcl)"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
jimtcl \
libjim0_81"

inherit rpm
