SUMMARY = "Distributed Task Queue module for Python"
DESCRIPTION = "Celery is an asynchronous task queue/job queue based on distributed \
message passing. It is focused on real-time operation, but supports \
scheduling as well."
LICENSE = "BSD-3-Clause"

PV = "5.2.7"

RPM_NAME = "python39-celery-5.2.7-3.1.noarch.rpm"
RPM_HASH = "0500d8b89d57111d4104d63d4949e06390f13b45feafd08d5633550c6be70f3b3562d6aea711674160f0bdb067425e5b0866f3ef272a57cfef69490fc1063fdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(celery) \
python39-celery \
python3dist(celery)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-billiard \
python39-click \
python39-click-didyoumean \
python39-click-plugins \
python39-click-repl \
python39-kombu \
python39-pytz \
python39-vine \
update-alternatives"

inherit rpm
