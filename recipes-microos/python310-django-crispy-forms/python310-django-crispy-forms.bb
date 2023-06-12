SUMMARY = "Django DRY Forms"
DESCRIPTION = "A module to build programmatic reusable layouts out of components \
with control over the rendered HTML without writing HTML in \
templates, and without breaking the standard way of doing things in \
Django."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "python310-django-crispy-forms-1.14.0-1.3.noarch.rpm"
RPM_HASH = "77746e19f6f5e7b973d8c751f19e4cae79a996f9525f8fc1badd16d3115936a9c1fad028c68adcfb724e6a1af7735f197ed69c4914306f1bc351eb1c1e7dfeb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-crispy-forms \
python3.10dist(django-crispy-forms) \
python310-django-crispy-forms \
python3dist(django-crispy-forms)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
