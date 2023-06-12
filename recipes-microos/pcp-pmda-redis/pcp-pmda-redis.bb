SUMMARY = "Performance Co-Pilot (PCP) metrics for Redis"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from Redis servers (redis.io)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-redis-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "f5d901f2b847819010e98e003e34465a96bd12d3d17294ede968e181ec872f5df7e1c2df58d4acb82d411c54e0698e524c16b6e989189fb1ade739020e11db61"

RPROVIDES:${PN} += "pcp-pmda-redis \
pcp-pmda-redis(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
