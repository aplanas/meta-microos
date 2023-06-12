SUMMARY = "Automatically upgrade your Django projects"
DESCRIPTION = "Automatically upgrade your Django projects."
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "python310-django-upgrade-1.13.0-1.2.noarch.rpm"
RPM_HASH = "b7d477185c925f66f3c6bd5a3c88207d2aa3208c1e75459b8ded71c5c8ad5313030a75649c4b4a1c4484699b28bad69058421ed31cad842c6e7c0fa49835ba4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-upgrade \
python3.10dist(django-upgrade) \
python310-django-upgrade \
python3dist(django-upgrade)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-tokenize-rt \
update-alternatives"

inherit rpm
