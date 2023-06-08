SUMMARY = "Django data importing and exporting"
DESCRIPTION = "Django application and library for importing and exporting data with included admin integration."
LICENSE = "BSD-2-Clause"

PV = "2.7.1"

RPM_NAME = "python310-django-import-export-2.7.1-1.8.noarch.rpm"
RPM_HASH = "91ced466d1f0b22e6e9394634d64cd9f4c62172f10b657a27b19696b96fddac4438665b49f4f05101a308c25e2dffe3e596ceb64305527dd3214138bb55cdce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-import-export python3.10dist(django-import-export) python310-django-import-export python3dist(django-import-export)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-diff-match-patch python310-tablib"

inherit rpm
