SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "python39-jsonschema-spec-0.1.4-1.2.noarch.rpm"
RPM_HASH = "79ef997e8626162e211f96ac531f0540c5e3747b7081fc8e468bbcf2688dd7aad837645f9a7e80220765763136b8f58263b0df9ddec84715f6d51629277caf94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonschema-spec) python39-jsonschema-spec python3dist(jsonschema-spec)"
RDEPENDS:${PN} += "python(abi) python39-PyYAML python39-jsonschema python39-pathable python39-typing_extensions"

inherit rpm
