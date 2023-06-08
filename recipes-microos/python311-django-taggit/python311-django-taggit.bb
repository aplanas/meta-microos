SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.0.0"

RPM_NAME = "python311-django-taggit-4.0.0-1.1.noarch.rpm"
RPM_HASH = "94a3372e6f24448025ac0d59753fe0b08643b01243141597eb73f3a9d6377387ae9880ef721bb9f722e9bbedc4721fb0ce4396ebb6268e8750f7749011ee3e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-taggit) python311-django-taggit python3dist(django-taggit)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
