SUMMARY = "Performance Co-Pilot (PCP) metrics for GPFS Filesystem"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the GPFS filesystem."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-gpfs-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "489fe0ba17ac180d3c0be7ffecfbf936a4d866f787f69eeb335b9aab69c4e089614e9d343742a1a576896dd1ff6ad6c525fc34a2680bf6c12f0b079f142b539b"

RPROVIDES:${PN} += "pcp-pmda-gpfs pcp-pmda-gpfs(aarch-64)"
RDEPENDS:${PN} += "/bin/sh perl-PCP-PMDA"

inherit rpm
