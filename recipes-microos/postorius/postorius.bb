SUMMARY = "A web user interface for GNU Mailman"
DESCRIPTION = "A web user interface for GNU Mailman"
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "postorius-1.3.7-1.3.noarch.rpm"
RPM_HASH = "402e7e2b76c2cff13269025dea430048dce6e42334bc3fc65c9a6b483187ef47c13172d064cd0ead11c9fc69379279b8a2da266976e787afd14a974db06868db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postorius python3.9dist(postorius) python39-postorius python3dist(postorius)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-django-debug-toolbar python39-django-mailman3 python39-django-requests-debug-toolbar python39-mailmanclient python39-readme_renderer"

inherit rpm
