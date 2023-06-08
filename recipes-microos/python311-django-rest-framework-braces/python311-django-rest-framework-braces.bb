SUMMARY = "Django REST Framework (DRF) utilities"
DESCRIPTION = "Collection of utilities for working with Django REST Framework (DRF)."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-django-rest-framework-braces-0.3.4-5.4.noarch.rpm"
RPM_HASH = "bc2ffb2f34a63d17bd3a0b801ccfe093b3c213646d8d03c5b544532afd97029db54ae037468dbbcc47fb8d4d96e9986009053452fed3caf45756a4da8f97975a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-rest-framework-braces) python311-django-rest-framework-braces python3dist(django-rest-framework-braces)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-dateutils python311-djangorestframework python311-pytz python311-six"

inherit rpm
