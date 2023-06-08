SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python311-django-crispy-forms-1.14.0-1.3.noarch.rpm"
RPM_HASH = "d5ff30a0d0db123eed152aa1960533b0a5744e24c9eb42bbc39cbce38b2b239eda4e3fb76e8b22b3090ac7d69dc81f6cc28ef0abeda807ae70d820219b5de8e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-crispy-forms) python311-django-crispy-forms python3dist(django-crispy-forms)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
