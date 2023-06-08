SUMMARY = "Django model mixins and utilities"
DESCRIPTION = "Django model mixins and utilities."
LICENSE = "BSD-3-Clause"

PV = "4.3.1"

RPM_NAME = "python310-django-model-utils-4.3.1-1.3.noarch.rpm"
RPM_HASH = "b6eff403bb54016c522a2f9a8d6ab6b38bdb06bac21643fa2d3e0ba05145c58513262742a53dadc570bdfd669a956733c1198cae0e1895456ca03279c5a174a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-model-utils python3.10dist(django-model-utils) python310-django-model-utils python3dist(django-model-utils)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
