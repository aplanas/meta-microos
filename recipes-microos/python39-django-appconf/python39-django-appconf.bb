SUMMARY = "A Helper Class for Handling Configuration Defaults of Packaged Apps"
DESCRIPTION = "A helper class for handling configuration defaults of packaged Django apps \
gracefully."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "python39-django-appconf-1.0.5-1.4.noarch.rpm"
RPM_HASH = "ed7ebfeab35de99c54061780da670251a406d8dd45e0082ab831ed2556998862c7cd3b1cc9826751e52231cc3273673a5571f9ddf5a6a512d4c243d578258678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-appconf) python39-django-appconf python3dist(django-appconf)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
