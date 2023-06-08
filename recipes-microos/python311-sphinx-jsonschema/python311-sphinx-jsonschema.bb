SUMMARY = "Sphinx extension to display JSON Schema"
DESCRIPTION = "Sphinx extension to display JSON Schema."
LICENSE = "GPL-3.0-only"

PV = "1.16.8"

RPM_NAME = "python311-sphinx-jsonschema-1.16.8-1.8.noarch.rpm"
RPM_HASH = "66a2b93723872f6ca903f4d0fb03cec14711305b2023d57d06251d2fb39eed8cc8d1b2e006943b11f7176d77f02313502889b52a691d4d31138dc883453b706e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-jsonschema) python311-sphinx-jsonschema python3dist(sphinx-jsonschema)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-docutils python311-jsonpointer python311-requests"

inherit rpm
