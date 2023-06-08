SUMMARY = "Multiprocessing Distributed Task Queue for Django"
DESCRIPTION = "This package provides a multiprocessing distributed task queue for Django."
LICENSE = "MIT"

PV = "1.3.9"

RPM_NAME = "python310-django-q-1.3.9-3.5.noarch.rpm"
RPM_HASH = "9631ae5e20e3f9d67e358950b421be352c3ff1503ae59c13ecc5db25e42946407dacb8ce855660bfde41fc56c39f9cd6622707bd10522b2f723a69e278bf4445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-q python3.10dist(django-q) python310-django-q python3dist(django-q)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-arrow python310-blessed python310-django-picklefield python310-redis"

inherit rpm
