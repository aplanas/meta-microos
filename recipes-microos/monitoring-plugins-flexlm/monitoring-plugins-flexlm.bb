SUMMARY = "Check flexlm license managers"
DESCRIPTION = "Flexlm license managers usually run as a single server or three servers and a \
quorum is needed.  The plugin return OK if 1 (single) or 3 (triple) servers \
are running, CRITICAL if 1(single) or 3 (triple) servers are down, and WARNING \
if 1 or 2 of 3 servers are running."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-flexlm-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "8a96a1d56df3e546d456fc789c6e9ef402d8619fec76532940b9f03cd067178e166d83ba006dfe875e2f9366bea404ceb632044d7392f9b3ae7f7ed27c4e4889"

RPROVIDES:${PN} += "monitoring-plugins-flexlm monitoring-plugins-flexlm(aarch-64) nagios-plugins-flexlm"
RDEPENDS:${PN} += "/usr/bin/perl monitoring-plugins-common perl"

inherit rpm
