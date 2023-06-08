SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.14"

RPM_NAME = "python39-croniter-1.3.14-1.1.noarch.rpm"
RPM_HASH = "f48b7c099d7bfacac7ea3bd025ad07271c436fcb34acac8c8d114ff760c936992199def7831b7f0096c0c29df7246584e0520fb27b2541f5a196956269301434"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(croniter) python39-croniter python3dist(croniter)"
RDEPENDS:${PN} += "python(abi) python39-python-dateutil"

inherit rpm
