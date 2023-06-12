SUMMARY = "Performance Co-Pilot (PCP) metrics for a GPS Daemon"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a GPS Daemon."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gpsd-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "eefbbc89b03d0db2f71ef3841e1797fb24f0cc8fb9740c53540a97fa913e05435351bf5bf6b69a44c56c93f49c386a9e91ee45d167fdd09c1fc0191498f99690"

RPROVIDES:${PN} += "pcp-pmda-gpsd \
pcp-pmda-gpsd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
