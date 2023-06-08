SUMMARY = "Drop-in replacement for django's many to many field with sorted relations"
DESCRIPTION = "Drop-in replacement for Django's many to many field with sorted relations."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "python311-django-sortedm2m-3.1.1-1.7.noarch.rpm"
RPM_HASH = "35ecff55cb77f03c95757a8069a14e86a52d269174a51d670d74b0e7f818d0f8e1a128923a5ae0e4b1a0a40fce95da6168352f4b6f23d83bb6b4e8f0b511aedd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-sortedm2m) python311-django-sortedm2m python3dist(django-sortedm2m)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
