SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-django-mathfilters-1.0.0-2.6.noarch.rpm"
RPM_HASH = "bf8ddedbb50b96c8f1a777cac8cb341d9a5d187c84f96120bd079eb50647558d836702a75afc18a654f49b8ec5d5598daa64dabd98d9413b99acdc44f31cb790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-mathfilters) python311-django-mathfilters python3dist(django-mathfilters)"
RDEPENDS:${PN} += "python(abi) python311-Django"

inherit rpm
