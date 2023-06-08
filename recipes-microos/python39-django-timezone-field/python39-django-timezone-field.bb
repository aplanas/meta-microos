SUMMARY = "Django app providing database and form fields for pytz timezone objects"
DESCRIPTION = "A Django app providing database and form fields for pytz timezone objects."
LICENSE = "BSD-2-Clause"

PV = "5.0"

RPM_NAME = "python39-django-timezone-field-5.0-1.4.noarch.rpm"
RPM_HASH = "02c26eb2a95a2cfb8362794c737000c1a54596997fdc0258957805b9cd769770a334aed63d5590a3443bc00107a82b0f8a9a82ce0c0672bedb8685d1aedd98a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-timezone-field) python39-django-timezone-field python3dist(django-timezone-field)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-pytz"

inherit rpm
