SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Server Loggers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from a 389 Directory Server log."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-ds389log-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "eddcf609ba90e903ac78061c44f116f09f5df0ff2a89685d7439189472f36d199393446059bcef5880e3d9e5729a59e8b3390e1a9a802af62490fe1f90406233"

RPROVIDES:${PN} += "pcp-pmda-ds389log \
pcp-pmda-ds389log(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl-Date-Manip \
perl-PCP-PMDA"

inherit rpm
