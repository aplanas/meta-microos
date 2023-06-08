SUMMARY = "Command line interface for Redmine"
DESCRIPTION = "A command line interface for Redmine."
LICENSE = "CECILL-B"

PV = "1.3.0"

RPM_NAME = "redminecli-1.3.0-1.10.noarch.rpm"
RPM_HASH = "1a5e0c827ad1dce46932e0fe10025ce325f3b0a2ba8c8034989eada2ea67ebeafaa1a9fe9b309de40025eb611bb6c5dbedde8aec850e648b2f8aaca9e2c023cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist(redminecli) python3dist(redminecli) redminecli"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-click python3-requests"

inherit rpm
