SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.3.6"

RPM_NAME = "python310-jsonschema-specifications-2023.3.6-1.2.noarch.rpm"
RPM_HASH = "fb7525315f39131a01049bcce5515e8df13fa37bf3f0a97382110826d8c7b7b5bb84084a44c8b5364573d71ab1a5a4afcc0ce19541d612c6e729e570e71ef10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-specifications python3.10dist(jsonschema-specifications) python310-jsonschema-specifications python3dist(jsonschema-specifications)"
RDEPENDS:${PN} += "python(abi) python310-referencing"

inherit rpm
