SUMMARY = "Extra class-based views for Django"
DESCRIPTION = "Extra class-based views for Django."
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python310-django-extra-views-0.14.0-3.3.noarch.rpm"
RPM_HASH = "8abab93f17aaf0a019ad91939d1efe9a1d8765434645cdbb897028c6f2fe95314ce23b153a42f951bafde3f7970041421c7d3c7f5f61b0767ee65ee91dc758a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-extra-views python3.10dist(django-extra-views) python310-django-extra-views python3dist(django-extra-views)"
RDEPENDS:${PN} += "python(abi) python310-Django"

inherit rpm
