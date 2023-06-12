SUMMARY = "Performance Co-Pilot (PCP) metrics for Memcached"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Memcached."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-memcache-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "bffccb40676aa667fcc1d6127d8b6f639ff35fcb530e21e586165ca1521cac864ede287015e662f24f3169fb26cd218a3967067762e70299c34ba67927ce39f3"

RPROVIDES:${PN} += "pcp-pmda-memcache \
pcp-pmda-memcache(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
