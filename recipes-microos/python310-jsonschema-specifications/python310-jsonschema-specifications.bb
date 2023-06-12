SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.5.2"

RPM_NAME = "python310-jsonschema-specifications-2023.5.2-1.1.noarch.rpm"
RPM_HASH = "edae29bbaab7182d6ae873557d36a766361c50db54b0afa7eee1b67a61cfbcf32d28884a1ab56b9f44b53b80b45f08bc4b1db19319e913fb4072f37bc56f5630"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-specifications python3.10dist(jsonschema-specifications) python310-jsonschema-specifications python3dist(jsonschema-specifications)"
RDEPENDS:${PN} += "python(abi) python310-referencing"

inherit rpm
