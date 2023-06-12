SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "python311-jsonschema-spec-0.1.4-2.1.noarch.rpm"
RPM_HASH = "8fbf10904b3f3aec427834a15f78382828ad34709e4068b9866f310d6b550e4820e47f027ef7b09181c135def7bfad75afd576dc9924afe2339fdfd54cd7e013"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonschema-spec) python311-jsonschema-spec python311-jsonschema_spec python3dist(jsonschema-spec)"
RDEPENDS:${PN} += "(python311-jsonschema >= 4.0.0 with python311-jsonschema < 4.18) python(abi) python311-PyYAML python311-pathable python311-typing_extensions"

inherit rpm
