SUMMARY = "Django rest framework support for python-social-auth and oauth2"
DESCRIPTION = "python-social-auth and oauth2 support for django-rest-framework."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-django-rest-framework-social-oauth2-1.1.0-1.15.noarch.rpm"
RPM_HASH = "8ce330a978f07e2e63aa7a440b929e38994f4a075e5c942d14dc2e4af643ac51373a93fb930fde6c014e139d6c8ff42ebaecb13541e851efa2301b8d705162cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-rest-framework-social-oauth2) python39-django-rest-framework-social-oauth2 python3dist(django-rest-framework-social-oauth2)"
RDEPENDS:${PN} += "python(abi) python39-django-braces python39-django-oauth-toolkit python39-djangorestframework python39-social-auth-app-django"

inherit rpm
