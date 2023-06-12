SUMMARY = "Performance Co-Pilot (PCP) metrics for Samba"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about Samba."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-samba-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "aaed04081646340a01cd02ef6bed6de604844a5f3713754f43e1bce40426eaf3c82f8183e3bf22b2fd5fc344d77ecefce68cc07841252b3bd4267870f14e1fd6"

RPROVIDES:${PN} += "pcp-pmda-samba \
pcp-pmda-samba(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
perl-PCP-PMDA"

inherit rpm
