SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.4.8"

RPM_NAME = "python311-django-widget-tweaks-1.4.8-1.11.noarch.rpm"
RPM_HASH = "15f4c641c342e9a630e6305bcb6ef4c3c4f52f92959f6abd84a294972757a5ac502759e46a6b71aa7ccd69a440c355f687dc8260cade9d544901824e1186a297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-widget-tweaks) \
python311-django-widget-tweaks \
python3dist(django-widget-tweaks)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
