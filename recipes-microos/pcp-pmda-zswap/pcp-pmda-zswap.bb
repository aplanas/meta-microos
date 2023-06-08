SUMMARY = "Performance Co-Pilot (PCP) metrics for compressed swap"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about compressed swap."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-zswap-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "b6b80f20ccbdd500ba3784612274df181b3b89b04c05af97e2d5e5c1859d3e4430b0e8192f60b0846a32eec403f1187fb2df500829c73688f45b9ff8be7755ce"

RPROVIDES:${PN} += "pcp-pmda-zswap pcp-pmda-zswap(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env python3-pcp"

inherit rpm
