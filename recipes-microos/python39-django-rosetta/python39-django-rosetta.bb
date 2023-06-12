SUMMARY = "Django application that eases the translation of Django projects"
DESCRIPTION = "Django application that eases the translation of Django projects."
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python39-django-rosetta-0.9.9-1.1.noarch.rpm"
RPM_HASH = "916d18c4544ec4a451f1e21f321559bff20b069f20be1cd78079c848cc1d8c990efb35e60c3566952dace5d3e306a79bb7aa6ec8c11b4292542d63d922abc711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-rosetta) \
python39-django-rosetta \
python3dist(django-rosetta)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-polib \
python39-requests"

inherit rpm
