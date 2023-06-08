SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2022.9"

RPM_NAME = "python39-weblate-language-data-2022.9-1.3.noarch.rpm"
RPM_HASH = "bf7c4393c859f1d868765d85fabc41ea506553ed90897a4139deda9e576ec98c3bc1de81c580401083b4cf3109c364f3b97c99b403d3afeb9bbef9e7e2eb8fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(weblate-language-data) python39-weblate-language-data python3dist(weblate-language-data)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
