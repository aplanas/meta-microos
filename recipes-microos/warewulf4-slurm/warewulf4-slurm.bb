SUMMARY = "Configuration template for slurm"
DESCRIPTION = "This package install the necessary configuration files in order to run a slurm \
cluster on the configured warewulf nodes."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-slurm-4.4.0-6.3.aarch64.rpm"
RPM_HASH = "27575ac9b584ca515bad5310d129a610adabc02db192e399fddb1eb9d09e1064023698c8de2f05c8087b59ffd9be3cd8e33f4cdf70f8409a017e845ddde070cf"

RPROVIDES:${PN} += "config(warewulf4-slurm) warewulf4-slurm warewulf4-slurm(aarch-64)"
RDEPENDS:${PN} += "slurm warewulf4"

inherit rpm
