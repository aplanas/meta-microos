SUMMARY = "Reusable, generic mixins for Django"
DESCRIPTION = "Reusable, generic mixins for Django."
LICENSE = "BSD-3-Clause"

PV = "1.15.0"

RPM_NAME = "python39-django-braces-1.15.0-2.5.noarch.rpm"
RPM_HASH = "e330acab7aa06e100331f5c02e15fc1cf5a66a584a0cdd1cc55f374eb16ec9b509061764fef9bd47a0f552a1d7c0ae695ab34471ba44ca60926e3c9f1734b5ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-braces) python39-django-braces python3dist(django-braces)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
