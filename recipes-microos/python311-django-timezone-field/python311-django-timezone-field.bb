SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "5.0"

RPM_NAME = "python311-django-timezone-field-5.0-1.4.noarch.rpm"
RPM_HASH = "04491ca9418e4c9615e52cdb6d7d67f5a78263e3144338a1a8eb90084319993ff3194250fa957988a66ab5cdca83298e35097ed581a9816816d9b31302c3d736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-timezone-field) python311-django-timezone-field python3dist(django-timezone-field)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-pytz"

inherit rpm
