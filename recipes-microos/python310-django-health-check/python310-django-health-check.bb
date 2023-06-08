SUMMARY = "Run checks on Django and is dependent services"
DESCRIPTION = "This project checks for various conditions and provides reports when anomalous \
behavior is detected. \
 \
Services checked include databases, caches, queue servers, celery processes, etc."
LICENSE = "MIT"

PV = "3.16.5"

RPM_NAME = "python310-django-health-check-3.16.5-3.5.noarch.rpm"
RPM_HASH = "16965326893bbc089022d145b695c3d98430f362b780a2cfb2d385c7d899803014753b825001255fd90a9609925a61fc1ff4efd6206639c5a16f5e98d0819bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-health-check python3.10dist(django-health-check) python310-django-health-check python3dist(django-health-check)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
