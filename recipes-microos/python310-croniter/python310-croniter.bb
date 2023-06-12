SUMMARY = "Python iterators for datetime objects with cron-like format"
DESCRIPTION = "croniter provides iterators for datetime object with cron-like format."
LICENSE = "MIT"

PV = "1.3.15"

RPM_NAME = "python310-croniter-1.3.15-1.1.noarch.rpm"
RPM_HASH = "7e14a84b1ce35f993227d31ecf6b470e8c469aa9bbf8f9f05b735658a2af990134332de389526111ff4f9143774ed7ef4a0ea8f63378fd743c9135d2ed6fb47e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-croniter python3.10dist(croniter) python310-croniter python3dist(croniter)"
RDEPENDS:${PN} += "python(abi) python310-python-dateutil"

inherit rpm
