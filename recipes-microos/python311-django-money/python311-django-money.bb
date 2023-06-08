SUMMARY = "Django support for using money and currency fields"
DESCRIPTION = "Django money and currency fields in models and forms."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "python311-django-money-3.0-1.3.noarch.rpm"
RPM_HASH = "934befa2eeb56393e0e4cafe831abcf605b0160ccca916f4584bee4c277fa5c35ef26713815113c81cc42cc2950bdd45f89bac752a033eb4ae95371c1e2a26ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-money) python311-django-money python3dist(django-money)"
RDEPENDS:${PN} += "python(abi) python311-Django python311-py-moneyed python311-setuptools"

inherit rpm
