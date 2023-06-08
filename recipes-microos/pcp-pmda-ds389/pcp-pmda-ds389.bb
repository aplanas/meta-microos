SUMMARY = "Performance Co-Pilot (PCP) metrics for 389 Directory Servers"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about a 389 Directory Server."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-ds389-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "71499077e37288c98a6d4420cf7a661ec5b299353d49db755bf81f6a377bba45327e826508931a5a061b3a53bf3ff8af1af199368bd93701d2ca7e30f07cdad4"

RPROVIDES:${PN} += "pcp-pmda-ds389 pcp-pmda-ds389(aarch-64)"
RDEPENDS:${PN} += "/bin/sh perl-PCP-PMDA perl-ldap"

inherit rpm
