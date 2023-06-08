SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.3.6"

RPM_NAME = "python39-jsonschema-specifications-2023.3.6-1.2.noarch.rpm"
RPM_HASH = "43bea1e1037bd403e0b90f0402a1e44f3f55506e7eb142ddbda423b243011967aaa4a7206741e9a40c9bcb35bbe7ac962c0f0460429be2ed3aea0ec5ff4487ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonschema-specifications) python39-jsonschema-specifications python3dist(jsonschema-specifications)"
RDEPENDS:${PN} += "python(abi) python39-referencing"

inherit rpm
