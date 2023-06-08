SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2022.9"

RPM_NAME = "python311-weblate-language-data-2022.9-1.3.noarch.rpm"
RPM_HASH = "1f95ffb89f7938b6645513df7b944c8a9c114922d1d6f9406b0504a172788dcd4cd6fc878455653b89f62861b69837fe56d4a30a2cd13fbbbb3a161a893930a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(weblate-language-data) python311-weblate-language-data python3dist(weblate-language-data)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
