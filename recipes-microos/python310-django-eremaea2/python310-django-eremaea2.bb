SUMMARY = "A simple Django application to store and show webcam snapshots"
DESCRIPTION = "django-eremaea2 is a simple Django application to store and manage webcam image snapshots. \
The application is built on top of django-rest-framework and provides REST API to access the files."
LICENSE = "BSD-2-Clause"

PV = "2.0.17"

RPM_NAME = "python310-django-eremaea2-2.0.17-3.1.noarch.rpm"
RPM_HASH = "cdd8fe2ea0e57130a6e70cac3d506ce9c8dbd6d6830dabc166eff436139fc17116a98390db282d5dcfc07e617a8e51a5010f80fb4faaf20bc68ca57ed288741f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-eremaea2 python3.10dist(django-eremaea2) python310-django-eremaea2 python3dist(django-eremaea2)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 eremaea python(abi) python310-Django python310-cmdln python310-djangorestframework python310-magic python310-requests python310-requests-toolbelt update-alternatives"

inherit rpm
