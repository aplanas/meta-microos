SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python311-django-extra-views-0.14.0-3.3.noarch.rpm"
RPM_HASH = "c5d3f3f4f90d7564761e69c36b567f93dd491d1042810f78c4936722f0fbbbb85eee3accd7627f5b59b0524b258aa43acaa95715b7ce83e73d3e837dca904907"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-extra-views) python311-django-extra-views python3dist(django-extra-views)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
