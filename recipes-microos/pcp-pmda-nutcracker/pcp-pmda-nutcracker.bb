SUMMARY = "Performance Co-Pilot (PCP) metrics for NutCracker (TwemCache)"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics from NutCracker (TwemCache)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-nutcracker-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "54db4025f30f8be2ae56a0bc6714c357b9edcd7804f7793a5d87328228e3c3eddb876365f2358c64cbe970353d9b0b6d0ae0c12fdd809ce514055e4414ffe007"

RPROVIDES:${PN} += "config(pcp-pmda-nutcracker) \
pcp-pmda-nutcracker \
pcp-pmda-nutcracker(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl(JSON) \
perl(YAML::XS::LibYAML) \
perl-PCP-PMDA"

inherit rpm
