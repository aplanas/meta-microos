SUMMARY = "Django model field that can hold a geoposition"
DESCRIPTION = "Django model field that can hold a geoposition, and corresponding admin widget."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-django-geoposition-0.3.0-2.7.noarch.rpm"
RPM_HASH = "99e66800f9a2e8ac9bf8ab3355e56b6f82da74a142ecd4e4b163234b6b25b161740ade020ad6d051aa57cd979ed98d97e1bfc3e51d17eeeedb4b234f23f458a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-geoposition python3.10dist(django-geoposition) python310-django-geoposition python3dist(django-geoposition)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
