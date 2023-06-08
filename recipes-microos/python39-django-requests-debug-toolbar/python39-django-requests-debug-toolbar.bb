SUMMARY = "A Django Debug Toolbar panel for Requests"
DESCRIPTION = "Django Requests Debug Toolbar tracks all HTTP requests made with the popular \
requests library."
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-django-requests-debug-toolbar-0.0.3-1.3.noarch.rpm"
RPM_HASH = "adb04b101d1bd748e00d8b9b86cc947ac0ba0ed363e5bd18be269d3ad772821f69e2eb1149d8372f764bc38025809b1ddd20aa40dfbcba095fcc553ec895fdcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-requests-debug-toolbar) python39-django-requests-debug-toolbar python3dist(django-requests-debug-toolbar)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
