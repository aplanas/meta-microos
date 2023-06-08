SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-django-json-widget-1.1.1-1.4.noarch.rpm"
RPM_HASH = "a999e862b4daaa99cf08f6bcfa0818c7374f90af59f0d77a9f01b3a5ccb896b9c5414d9efd9e4f424973932944daac08f2fd38a2848ff493263ee3b7ce71c1de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-json-widget) python39-django-json-widget python3dist(django-json-widget)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-future"

inherit rpm
