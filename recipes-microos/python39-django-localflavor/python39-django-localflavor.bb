SUMMARY = "Country-specific Django helpers"
DESCRIPTION = "Country-specific Django helpers."
LICENSE = "BSD-3-Clause"

PV = "4.0"

RPM_NAME = "python39-django-localflavor-4.0-1.1.noarch.rpm"
RPM_HASH = "587dd7cea7f0bc3d32619698ae811d8cc3c95a00851582dd343b3e5712bb984ecf81faa32322eea31b1dd574f484ba4a6b723e3d1420f0f0fe9339fd436c433d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-localflavor) python39-django-localflavor python3dist(django-localflavor)"
RDEPENDS:${PN} += "python(abi) python39-Django python39-python-stdnum"

inherit rpm
