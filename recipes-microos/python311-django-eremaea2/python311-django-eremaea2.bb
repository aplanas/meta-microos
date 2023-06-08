SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.17"

RPM_NAME = "python311-django-eremaea2-2.0.17-3.1.noarch.rpm"
RPM_HASH = "af65302e228fe8f73cda732e3350bc403b8696d0ce349fc9141a3191d97ab1890731bb438e8aef9ba5a5d40c253298603ac57928d116e97f0b88e6189dda0153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-eremaea2) python311-django-eremaea2 python3dist(django-eremaea2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 eremaea python(abi) python311-Django python311-cmdln python311-djangorestframework python311-magic python311-requests python311-requests-toolbelt update-alternatives"

inherit rpm
