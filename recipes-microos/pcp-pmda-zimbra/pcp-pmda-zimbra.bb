SUMMARY = "Performance Co-Pilot (PCP) metrics for Zimbra"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Zimbra."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-zimbra-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "ae0471c1859626416029dcde8176a4aa4297b17564ef7a292a3ee85ef460f51c63b963f51de89aa39d1890fce354f08b7eca50591fb9cb629d5d5c2c46e31218"

RPROVIDES:${PN} += "pcp-pmda-zimbra pcp-pmda-zimbra(aarch-64)"
RDEPENDS:${PN} += "/bin/sh perl-PCP-PMDA"

inherit rpm
