SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.18"

RPM_NAME = "python311-django-eremaea2-2.0.18-1.1.noarch.rpm"
RPM_HASH = "f90deb8d764a5a5ceff63ecb441231f39dd8fb6e589f6cf57f66f637ca2e70ce66764ec213a289795348d361dad0f6931826e5ea666f8d180ad8473ef1974acc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-eremaea2) python311-django-eremaea2 python3dist(django-eremaea2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 eremaea python(abi) python311-Django python311-cmdln python311-djangorestframework python311-magic python311-requests python311-requests-toolbelt update-alternatives"

inherit rpm
