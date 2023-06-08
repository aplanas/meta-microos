SUMMARY = "Python helpers for manipulating datetime objects relative to time zones"
DESCRIPTION = "Python helpers for manipulating datetime objects relative to time zones."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-fleming-0.7.0-1.3.noarch.rpm"
RPM_HASH = "6820e933fb6b44a40d89f47edd54fc49d283df6f1c3d7249f621830c9d3d8178145872d49297ad38d7b665d4640208cdbd5925ab8fbce6136ff2a3b55525cee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fleming) python39-fleming python3dist(fleming)"
RDEPENDS:${PN} += "python(abi) python39-python-dateutil python39-pytz"

inherit rpm
