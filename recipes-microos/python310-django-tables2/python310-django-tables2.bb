SUMMARY = "Table/data-grid framework for Django"
DESCRIPTION = "Simplifies the task of turning sets of data into HTML tables. It has native \
support for pagination and sorting. It does for HTML tables what django.forms \
does for HTML forms."
LICENSE = "BSD-2-Clause"

PV = "2.5.3"

RPM_NAME = "python310-django-tables2-2.5.3-1.1.noarch.rpm"
RPM_HASH = "d64d4c6f6acccdf3bdee64c57b41c061d7a95d48486c90e227f8833bf36e1156b3d4e38e96112360ec02c1dd57eda761c8eef1b24c1e5a8be6455e3b39e15a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-tables2 python3.10dist(django-tables2) python310-django-tables2 python3dist(django-tables2)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
