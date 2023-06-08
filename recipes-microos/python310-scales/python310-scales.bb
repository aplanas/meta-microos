SUMMARY = "Stats for Python processes"
DESCRIPTION = "Statistic generator for python processes"
LICENSE = "Apache-2.0"

PV = "1.0.9"

RPM_NAME = "python310-scales-1.0.9-3.12.noarch.rpm"
RPM_HASH = "bc9d06bff639de81a3073dd34175be8a940a34a7f8d1ae3a57fd5d0e5a06eaa35d60895524843b55bd65a14d915a27d96d3704254648b692ea06c8f00d1ebbe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scales python3.10dist(scales) python310-scales python3dist(scales)"
RDEPENDS:${PN} += "python(abi) python310-six"

inherit rpm
