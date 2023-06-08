SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.17"

RPM_NAME = "python39-django-eremaea2-2.0.17-3.1.noarch.rpm"
RPM_HASH = "84f6069097a8ccf5c60ed66145d61efd3113352de5614125c2829bffd5c4f333e509b3975d3cb6e2a85d15398fa9aec8cc460b81f1442866f7713159003e9691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-eremaea2) python39-django-eremaea2 python3dist(django-eremaea2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 eremaea python(abi) python39-Django python39-cmdln python39-djangorestframework python39-magic python39-requests python39-requests-toolbelt update-alternatives"

inherit rpm
