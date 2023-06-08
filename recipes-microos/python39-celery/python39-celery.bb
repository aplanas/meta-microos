SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python39-celery-5.2.7-2.2.noarch.rpm"
RPM_HASH = "76bdd5b99a11c86618d1ee2c6988db21c504e55bc96d129188d832219c572ecd535cfbf0972a88124605d6e5b6a98cece2915064e8d118c7cb29fc85d307ee5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(celery) python39-celery python3dist(celery)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-billiard python39-click python39-click-didyoumean python39-click-plugins python39-click-repl python39-kombu python39-pytz python39-vine update-alternatives"

inherit rpm
