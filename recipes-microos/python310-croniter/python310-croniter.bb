SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.14"

RPM_NAME = "python310-croniter-1.3.14-1.1.noarch.rpm"
RPM_HASH = "37f551134ec11212663e24f5579655c0b8699a3b52591ea1ee1b986e18752a266020e097c01feef05ef271ebee5ceb05f1b5801c66d8c2fac44b703c965f5a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-croniter python3.10dist(croniter) python310-croniter python3dist(croniter)"
RDEPENDS:${PN} += "python(abi) python310-python-dateutil"

inherit rpm
