SUMMARY = "Performance Co-Pilot (PCP) metrics for Named"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the Named nameserver."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-named-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "3cbc3fab833bb81d806c40f97ded636d48d3a50d318e908e264464331c4ad774262480fdc6cd6fccfc9f68f4edb63d59a3eef98bb975851cff52de4e926f0291"

RPROVIDES:${PN} += "pcp-pmda-named pcp-pmda-named(aarch-64)"
RDEPENDS:${PN} += "/bin/sh perl-PCP-PMDA"

inherit rpm
