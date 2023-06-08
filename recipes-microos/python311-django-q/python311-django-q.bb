SUMMARY = "Multiprocessing Distributed Task Queue for Django"
DESCRIPTION = "This package provides a multiprocessing distributed task queue for Django."
LICENSE = "MIT"

PV = "1.3.9"

RPM_NAME = "python311-django-q-1.3.9-3.5.noarch.rpm"
RPM_HASH = "0f91e80ef5c69fc3574f6e58c1c550de0c35df84fe2296564a4d2c2c19ecdb4f80c7042fb6344d80d015ae2bd6dc2ff18bf7625d630535974f1e84fac0dfaf5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-q) python311-django-q python3dist(django-q)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-arrow python311-blessed python311-django-picklefield python311-redis"

inherit rpm
