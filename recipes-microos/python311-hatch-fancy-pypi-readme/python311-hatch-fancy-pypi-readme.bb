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

RPM_NAME = "python311-hatch-fancy-pypi-readme-22.8.0-3.1.noarch.rpm"
RPM_HASH = "85d77ec622c246886acc30d944b0aee1523f8351077f94d881cc9cb1f2c2ee0ce844d1ff10d5948fe360143d703905eee944acec4f827e4baaeec276941f9c98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatch-fancy-pypi-readme) python311-hatch-fancy-pypi-readme python311-hatch_fancy_pypi_readme python3dist(hatch-fancy-pypi-readme)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python3.11dist(hatchling) update-alternatives"

inherit rpm
