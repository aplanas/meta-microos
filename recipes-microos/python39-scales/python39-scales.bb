SUMMARY = "Stats for Python processes"
DESCRIPTION = "Statistic generator for python processes"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python39-scales-1.0.9-3.12.noarch.rpm"
RPM_HASH = "76a81610ed541bc7ebd71377876ded7f114fb98e1a1459c4fc7099d27bf91d6c50ec2b7b5b33a479353df75874a24f6d26317bd158780e268ff0c1912aa47d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scales) \
python39-scales \
python3dist(scales)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
