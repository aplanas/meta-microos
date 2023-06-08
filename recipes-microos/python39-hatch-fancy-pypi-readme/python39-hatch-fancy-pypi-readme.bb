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

RPM_NAME = "python39-hatch-fancy-pypi-readme-22.8.0-3.1.noarch.rpm"
RPM_HASH = "d94e1d1c9c35289931403dbd72a1dc969f1b9875b1ac0609446fc04d5c41d560249a6dee47c5ca79a792d1dc6d75748d7c4eb1d7f17d84d8f90800339a53786f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hatch-fancy-pypi-readme) python39-hatch-fancy-pypi-readme python39-hatch_fancy_pypi_readme python3dist(hatch-fancy-pypi-readme)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python3.9dist(hatchling) python3.9dist(tomli) update-alternatives"

inherit rpm
