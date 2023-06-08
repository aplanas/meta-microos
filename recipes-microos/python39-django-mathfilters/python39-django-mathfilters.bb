SUMMARY = "Django math filters"
DESCRIPTION = "A set of math filters for Django."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-django-mathfilters-1.0.0-2.6.noarch.rpm"
RPM_HASH = "59ba60fbd49b8bc9b02220a3f8ba8e942819ed75da9b14e1d125876d5e2e123bffb7affb56e4f658b355b003a9894a23536033bad5a1eb432758e5bd0e5bccf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-mathfilters) python39-django-mathfilters python3dist(django-mathfilters)"
RDEPENDS:${PN} += "python(abi) python39-Django"

inherit rpm
