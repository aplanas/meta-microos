SUMMARY = "PEP 621 metadata parsing"
DESCRIPTION = "Dataclass for PEP 621 metadata with support for core metadata generation \
 \
This project does not implement the parsing of `pyproject.toml` \
containing PEP 621 metadata. \
 \
Instead, given a Python data structure representing PEP 621 metadata (already \
parsed), it will validate this input and generate a PEP 643-compliant metadata \
file (e.g. `PKG-INFO`)."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python39-pyproject-metadata-0.6.1-3.1.noarch.rpm"
RPM_HASH = "04f45ad81f50095b6a6d766e46d016953167bc6c28dce49f4cf698ef1a551ff6a50a043478f13a8ba76f67a9e39d122e4ceacd4f9d06879e4b2cfcd195db7360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyproject-metadata) python39-pyproject-metadata python3dist(pyproject-metadata)"
RDEPENDS:${PN} += "python(abi) python39-packaging"

inherit rpm
