SUMMARY = "Compatibility library for Django"
DESCRIPTION = "Version checking library for Django."
LICENSE = "GPL-2.0-only | LGPL-2.1-or-later"

PV = "0.2.7"

RPM_NAME = "python310-django-nine-0.2.7-1.4.noarch.rpm"
RPM_HASH = "c2dd8aca2f52a3a08e0784d06ac5ed18c1747499285409e0d019bcde6e19ce565c26b1756982734be2a556dd3a719c78fb52ab8b1de9cf0c8d41657a957b2c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-nine \
python3.10dist(django-nine) \
python310-django-nine \
python3dist(django-nine)"
RDEPENDS:${PN} += "python(abi) \
python310-packaging"

inherit rpm
