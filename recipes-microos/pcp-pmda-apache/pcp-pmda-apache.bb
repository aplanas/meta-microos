SUMMARY = "Performance Co-Pilot (PCP) metrics for the Apache webserver"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Apache webserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-apache-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "55a77414a938abc8eb05791bdbd11fab34f4830c84609c704a996d7bd927a50bb7beded3fe7575997b313e202aadd8127e510d642add263d941b08a1718f7546"

RPROVIDES:${PN} += "pcp-pmda-apache \
pcp-pmda-apache(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcp.so.3()(64bit) \
libpcp.so.3(PCP_3.0)(64bit) \
libpcp.so.3(PCP_3.21)(64bit) \
libpcp.so.3(PCP_3.22)(64bit) \
libpcp_pmda.so.3()(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.0)(64bit) \
libpcp_pmda.so.3(PCP_PMDA_3.1)(64bit) \
libpcp_web.so.1()(64bit) \
libpcp_web.so.1(PCP_WEB_1.1)(64bit)"

inherit rpm
