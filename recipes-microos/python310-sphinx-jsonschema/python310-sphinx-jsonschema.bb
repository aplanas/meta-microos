SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.16.8"

RPM_NAME = "python310-sphinx-jsonschema-1.16.8-1.8.noarch.rpm"
RPM_HASH = "c1a91e42aac48c6b29b4530cbdd0d6ce9bdabca15c144d5c9457443781decc934a37960a6190df5fa524eb41e7156823da6587bdb37716637b6b48afd17a83fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-jsonschema python3.10dist(sphinx-jsonschema) python310-sphinx-jsonschema python3dist(sphinx-jsonschema)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-docutils python310-jsonpointer python310-requests"

inherit rpm
