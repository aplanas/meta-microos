SUMMARY = "Fancy PyPI READMEs with Hatch"
DESCRIPTION = "hatch_fancy_pypi_readme is a Hatch metadata plugin for everyone who cares about \
the first impression of their project's PyPI landing page. It allows you to \
define your PyPI project description in terms of concatenated fragments that \
are based on static strings, files, and most importantly: parts of files \
defined using cut-off points or regular expressions. \
 \
Once you've assembled your readme, you can additionally run regular \
expression-based substitutions over it. For instance to make relative links \
absolute or to linkify users and issue numbers in your changelog. \
 \
Do you want your PyPI readme to be the project readme, but without badges, \
followed by the license file, and the changelog section for only the last \
release? You've come to the right place!"
LICENSE = "MIT"

PV = "22.8.0"

RPM_NAME = "python310-hatch-fancy-pypi-readme-22.8.0-3.1.noarch.rpm"
RPM_HASH = "bcb9503dab8e42a2de6eac6828339cc9e391cf290f396adeb22f30e56a82eeda1ece5dec26ffb10b56cac09b4c95c18b7d4799741a1d90b7df6b830119c6e2f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-fancy-pypi-readme python3-hatch_fancy_pypi_readme python3.10dist(hatch-fancy-pypi-readme) python310-hatch-fancy-pypi-readme python310-hatch_fancy_pypi_readme python3dist(hatch-fancy-pypi-readme)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python3.10dist(hatchling) python3.10dist(tomli) update-alternatives"

inherit rpm
