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

PV = "23.1.0"

RPM_NAME = "python39-hatch-fancy-pypi-readme-23.1.0-1.1.noarch.rpm"
RPM_HASH = "5fade5f881c74ad5c6bb6f4f5b68b54cf65927e7179c121e79ef71c78587d14e678fc563ac4a17eb1abfe03492ecd535a32963e2507ecbdb7f7c83586c311e5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hatch-fancy-pypi-readme) \
python39-hatch-fancy-pypi-readme \
python39-hatch_fancy_pypi_readme \
python3dist(hatch-fancy-pypi-readme)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python3.9dist(hatchling) \
python3.9dist(tomli) \
update-alternatives"

inherit rpm
