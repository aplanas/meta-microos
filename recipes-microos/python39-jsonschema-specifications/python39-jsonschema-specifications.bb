SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.5.2"

RPM_NAME = "python39-jsonschema-specifications-2023.5.2-1.1.noarch.rpm"
RPM_HASH = "1818706cdabcb48c0060c36070c0a5725e1c4d6b0b819fbd9ba93800ab89528fb2952d1829f8e526b7fbb0e212bc6e0966ce5a474090f25339f55d488d3b6631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonschema-specifications) \
python39-jsonschema-specifications \
python3dist(jsonschema-specifications)"
RDEPENDS:${PN} += "python(abi) \
python39-referencing"

inherit rpm
