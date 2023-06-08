SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python311-django-js-asset-2.0-1.3.noarch.rpm"
RPM_HASH = "e25ea67fd258f24c583f756bf8a455952a6298a49e26278903b85aed366aaae725743d9e2b001c9ea2dbaa2b12c954c5b54a74daa60b54ff5b97a7040f1bd379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-js-asset) python311-django-js-asset python3dist(django-js-asset)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
