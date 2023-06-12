SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python39-django-extra-views-0.14.0-3.3.noarch.rpm"
RPM_HASH = "318f2d725299a83e673f4e25a6c1560d77510ba10e60927e3da1434150ff1f09baf2f81f180e8c9ca884998129b2261a2d8f01246e145a3bbcf91277a7dcbd72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-extra-views) \
python39-django-extra-views \
python3dist(django-extra-views)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
