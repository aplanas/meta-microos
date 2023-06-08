SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-django-requests-debug-toolbar-0.0.3-1.3.noarch.rpm"
RPM_HASH = "c2984481a17f2883674a2041e646171da70bd2879b910e7840538702d48026540f77fb6fb52f27eed169b7a303883f3c8c533e6fa2650e4a3a34cbe761d15ad8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-requests-debug-toolbar) python311-django-requests-debug-toolbar python3dist(django-requests-debug-toolbar)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
