SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "14.2.0"

RPM_NAME = "python310-django-bootstrap3-14.2.0-2.6.noarch.rpm"
RPM_HASH = "aea0fa422c070bf9bb757a0fbeac2da70b6ec1abe6c4271fc08c83fa26cd50b53ae510f70992a6331a1e26fceaa762091e71570e1db645d1dababfde440d5edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-bootstrap3 python3.10dist(django-bootstrap3) python310-django-bootstrap3 python3dist(django-bootstrap3)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
