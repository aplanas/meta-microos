SUMMARY = "Forward compatibility django.utils.six for Django 3"
DESCRIPTION = "Forward compatibility django.utils.six for Django 3."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python311-django-utils-six-2.0-1.11.noarch.rpm"
RPM_HASH = "0acc048f857ff3a504afe48d1612d9a132a021193cb13e16619d7c4bd9a9abacd188d590191fad11dee6ffcb3b91a8727bb566bb8b689006eebe8ea0b43afb92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-utils-six) \
python311-django-utils-six \
python3dist(django-utils-six)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
