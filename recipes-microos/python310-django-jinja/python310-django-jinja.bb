SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.10.2"

RPM_NAME = "python310-django-jinja-2.10.2-1.3.noarch.rpm"
RPM_HASH = "f0789ac207838e4b688f8cd759a3d62b3a455d78e7cc54b547669acd173fdf5c3156f3aeac668353377160d4fad05d8f0a91f16665a6bcb68c3cf84edc69e0f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-jinja python3.10dist(django-jinja) python310-django-jinja python3dist(django-jinja)"
RDEPENDS:${PN} += "python(abi) python310-Django python310-Jinja2"

inherit rpm
