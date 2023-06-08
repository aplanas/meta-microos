SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python311-celery-5.2.7-2.2.noarch.rpm"
RPM_HASH = "bae33f676a85d8042ebf8ffcca09205f5bfa8d9229b93e3c1117cee8f889be2524cc0a89db0a2fb0dfaba2d81d0225de9be376465ae0dd0b1047320b664ef781"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(celery) python311-celery python3dist(celery)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-billiard python311-click python311-click-didyoumean python311-click-plugins python311-click-repl python311-kombu python311-pytz python311-vine update-alternatives"

inherit rpm
