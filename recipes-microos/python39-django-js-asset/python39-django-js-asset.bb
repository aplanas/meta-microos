SUMMARY = "Script tag with additional attributes for django.formsMedia"
DESCRIPTION = "Insert a script tag via forms.Media containing additional \
attributes (such as id and data-* for CSP-compatible data \
injection.)"
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python39-django-js-asset-2.0-1.3.noarch.rpm"
RPM_HASH = "ede482225b94490ba653188d413635e8a64dde6d6074e8c6f1db15ae9adb0db4b9c4aa38a9a5160e4e9290138e7cfa5973f5ae2911becab54d789cbf34fd0fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-js-asset) \
python39-django-js-asset \
python3dist(django-js-asset)"
RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
