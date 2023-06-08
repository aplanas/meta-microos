SUMMARY = "Usersctp Development Kit"
DESCRIPTION = "The development files for usersctp."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "usrsctp-devel-0.9.5.0-1.9.aarch64.rpm"
RPM_HASH = "65a23cc68a6484634f1016b4b8e58284d1b75f9d3dc86eadad9062fe02dc127bf96aad5f774797a303f617aed92508e00cf48b443dfc5cbedfc13027b2ee3775"

RPROVIDES:${PN} += "usrsctp-devel usrsctp-devel(aarch-64)"
RDEPENDS:${PN} += "libusrsctp2"

inherit rpm
