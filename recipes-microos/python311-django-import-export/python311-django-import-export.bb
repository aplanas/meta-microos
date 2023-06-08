SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python311-django-import-export-2.7.1-1.8.noarch.rpm"
RPM_HASH = "9075b61e829534284d52fb0e06d0f0617121ed222c5f3c6eaf7183c672293c1053c463b854bd322a6d532b3f30d3d901892292d55306327f6aa0dbf7e31c7ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-import-export) python311-django-import-export python3dist(django-import-export)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-diff-match-patch python311-tablib"

inherit rpm
