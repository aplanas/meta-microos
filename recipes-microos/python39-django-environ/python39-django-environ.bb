SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python39-django-environ-0.4.5-4.8.noarch.rpm"
RPM_HASH = "cb28a6cb287488d1fce54eae48b08c3ec3fc13792e7cce19b86f9a2367a3ebfbeea9f35930dfaabd52125169d5be38ec1f9be9e9537e303c0b56ba698b58e02d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-environ) python39-django-environ python3dist(django-environ)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
