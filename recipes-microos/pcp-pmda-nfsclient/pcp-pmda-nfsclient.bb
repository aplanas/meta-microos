SUMMARY = "Performance Co-Pilot (PCP) metrics for NFS Clients"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics for NFS Clients."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nfsclient-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "cf31040476ffbe020138fb2f33ea27cc7a55d0f72313c0f09287bc21af92a9ecf97c5a6c55f1ee1875269b61d585bae02152bc6a3075b49615d373d81044c45c"

RPROVIDES:${PN} += "pcp-pmda-nfsclient \
pcp-pmda-nfsclient(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
