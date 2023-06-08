SUMMARY = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
DESCRIPTION = "The JSON Schema meta-schemas and vocabularies, exposed as a Registry"
LICENSE = "MIT"

PV = "2023.3.6"

RPM_NAME = "python311-jsonschema-specifications-2023.3.6-1.2.noarch.rpm"
RPM_HASH = "654f76d174074fc360dcee608a6f4b364193f8b8f06f8f69a168bf4469552c58cf83b4293a4a179197033774d4af5a295594c1bff49c7f956003a4ca6d4aea32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonschema-specifications) python311-jsonschema-specifications python3dist(jsonschema-specifications)"
RDEPENDS:${PN} += "python(abi) python311-referencing"

inherit rpm
