SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.4.8"

RPM_NAME = "python310-django-widget-tweaks-1.4.8-1.11.noarch.rpm"
RPM_HASH = "08a7416674be34e5b62c86dca39184e783c82842750a272a59a7e921b2259b33206d82d1ad34061614fd7da822feca174f1dde6f8e35fb392cd99d9c6b215376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-widget-tweaks \
python3.10dist(django-widget-tweaks) \
python310-django-widget-tweaks \
python3dist(django-widget-tweaks)"
RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
