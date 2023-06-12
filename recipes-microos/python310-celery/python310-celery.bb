SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python310-celery-5.2.7-3.1.noarch.rpm"
RPM_HASH = "15a7a7eac0b3817b0d458666f3926d68d82c0788fcabf56a668b94e4e6af3c4e0bb86e18f361f64a92e97e14190775c5db2772da38ce9afecb6a16b374a6ef37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery python3.10dist(celery) python310-celery python3dist(celery)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-billiard python310-click python310-click-didyoumean python310-click-plugins python310-click-repl python310-kombu python310-pytz python310-vine update-alternatives"

inherit rpm
