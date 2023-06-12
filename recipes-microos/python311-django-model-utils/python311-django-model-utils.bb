SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "python311-django-model-utils-4.3.1-1.3.noarch.rpm"
RPM_HASH = "6d7ab2da56ec13c06ed5f21f80b1c614327beb5b65b0c782417b783d4283cdd17d99ab1ea2f995e7d3948dd0eeeb4f64548682441a658c9e8ae1fe5d7117b576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-model-utils) \
python311-django-model-utils \
python3dist(django-model-utils)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
