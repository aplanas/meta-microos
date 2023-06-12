SUMMARY = "Configuration template for slurm"
DESCRIPTION = "This package install the necessary configuration files in order to run a slurm \
cluster on the configured warewulf nodes."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-slurm-4.4.0-6.4.aarch64.rpm"
RPM_HASH = "c209fc3ad3959c16ef950756db10338c10b982dc74b049bc1ab7ae3abbf7f5a17580b59414dafd32eae2065177b5a75e0c7b125c3efb909cc5798e779a0fecfe"

RPROVIDES:${PN} += "config(warewulf4-slurm) \
warewulf4-slurm \
warewulf4-slurm(aarch-64)"
RDEPENDS:${PN} += "slurm \
warewulf4"

inherit rpm
