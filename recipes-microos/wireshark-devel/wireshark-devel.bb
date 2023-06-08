SUMMARY = "A Network Traffic Analyser"
DESCRIPTION = "Wireshark is a network protocol analyzer. It allows examining data \
from a live network or from a capture file on disk."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.5"

RPM_NAME = "wireshark-devel-4.0.5-1.1.aarch64.rpm"
RPM_HASH = "db2141ad852e6befeb907f0e0d535703566d992d02ada8210a7de0e3e3e31560e76191e67ba5f25a0fbffa19649f33c7f31a8842606ee11701d3f68aba19e38c"

RPROVIDES:${PN} += "ethereal-devel pkgconfig(wireshark) wireshark-devel wireshark-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glib2-devel glibc-devel libwireshark16 libwiretap13 libwsutil14 pkgconfig(glib-2.0) pkgconfig(gmodule-2.0) pkgconfig(gthread-2.0) wireshark"

inherit rpm
