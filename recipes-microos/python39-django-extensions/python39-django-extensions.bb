SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python39-django-extensions-3.2.1-2.3.noarch.rpm"
RPM_HASH = "3c19b08b15569467dd5de0e28271adb77b4fb19069c6f4b0eecc5ea279587857001cfa5c051780544e7c82b725d398b5038ae69943175bd358c01f42cdd983aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-extensions) python39-django-extensions python3dist(django-extensions)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
