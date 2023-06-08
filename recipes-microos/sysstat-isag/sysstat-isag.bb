SUMMARY = "Interactive System Activity Grapher for sysstat"
DESCRIPTION = "This package includes the isag command, which graphically displays the \
system activity data stored in a binary data produced by a sar command \
from a sysstat package."
LICENSE = "GPL-2.0-or-later"

PV = "12.6.2"

RPM_NAME = "sysstat-isag-12.6.2-1.1.aarch64.rpm"
RPM_HASH = "830219730923c4c5f44ca55b5e16c29b59fc265044a99e5105fe4a24cc5640c31d1c8a2410adffbc25a1453dcdddcb280fa48a339b3c3983b0294e9d016e0116"

RPROVIDES:${PN} += "application() application(isag.desktop) sysstat-isag sysstat-isag(aarch-64)"
RDEPENDS:${PN} += "/bin/sh gnuplot sysstat tk"

inherit rpm
