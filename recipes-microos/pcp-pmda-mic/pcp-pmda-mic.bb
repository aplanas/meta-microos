SUMMARY = "Performance Co-Pilot (PCP) metrics for Intel MIC cards"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Intel MIC cards."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-mic-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "ee952e99074be9aaa615446f665685ee44bd3cdcedbf54d2f90778c617c4dd47e6dcc0f8889f2a1fef93116f1c110b8cbe6980ab0b3bda86a0d1fdbe651a9823"

RPROVIDES:${PN} += "pcp-pmda-mic \
pcp-pmda-mic(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
python3-pcp"

inherit rpm
