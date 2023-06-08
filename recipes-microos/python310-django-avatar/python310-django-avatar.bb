SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "7.1.1"

RPM_NAME = "python310-django-avatar-7.1.1-1.2.noarch.rpm"
RPM_HASH = "3c79caa8b4782550e878cfa6185baf15fca127c6aaf626e9e7843495284c490bfb249e2db2960938152af0c0fbac624db382a958dd78879c27a2da0c0fbe433e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-avatar python3.10dist(django-avatar) python310-django-avatar python3dist(django-avatar)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-Pillow python310-django-appconf python310-dnspython"

inherit rpm
