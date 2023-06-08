SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python39-typogrify-2.0.7-1.11.noarch.rpm"
RPM_HASH = "1bf1d7653aaedeff58c0c4ac6cebe5cc6619a20a1b7106f2446e16b5d17bb713fc190738af49816da4c5a4e86a65352be6e5d050f0a8e21aadb1d0dc7c298e5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(typogrify) python39-typogrify python3dist(typogrify)"
RDEPENDS:${PN} += "python(abi) python39-smartypants"

inherit rpm
