SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python310-celery-5.2.7-2.2.noarch.rpm"
RPM_HASH = "9c56e8b291c3b556b2e7fee6a99fcfbd99931654c4a9beb92b80bd5fc3778a1eb764d6838e19574b0e8bfeb068dcaa6463175122a207ed55ee1db9c200ee797a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-celery python3.10dist(celery) python310-celery python3dist(celery)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-billiard python310-click python310-click-didyoumean python310-click-plugins python310-click-repl python310-kombu python310-pytz python310-vine update-alternatives"

inherit rpm
