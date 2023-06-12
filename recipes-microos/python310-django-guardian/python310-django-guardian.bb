SUMMARY = "Implementation of per object permissions for Django"
DESCRIPTION = "django-guardian is implementation of per object permissions as \
authorization backend."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "python310-django-guardian-2.4.0-3.5.noarch.rpm"
RPM_HASH = "089449e67931221b5aa998dcf5d5811cdb66da8bb5ae621f0cef7a833b53a9fc8485e42cbc233602cbb169c6992c87c9f727bba90193877c9cba5fd90a41e737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-guardian \
python3.10dist(django-guardian) \
python310-django-guardian \
python3dist(django-guardian)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
