SUMMARY = "Multiprocessing Distributed Task Queue for Django"
DESCRIPTION = "This package provides a multiprocessing distributed task queue for Django."
LICENSE = "MIT"

PV = "1.3.9"

RPM_NAME = "python39-django-q-1.3.9-3.5.noarch.rpm"
RPM_HASH = "f079f516da5a5342ad0086d3e0891292bfab0c90243bf304e52a477badccf46569d996e8967348dc2d9da6909d03c6a80a37fd9bbf7de504ce4d3a25c80386e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-q) python39-django-q python3dist(django-q)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-arrow python39-blessed python39-django-picklefield python39-redis"

inherit rpm
