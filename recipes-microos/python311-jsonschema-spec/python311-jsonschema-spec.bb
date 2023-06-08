SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "python311-jsonschema-spec-0.1.4-1.2.noarch.rpm"
RPM_HASH = "c9f222a89eb8ebc3b6e853f6646f666f72e2560be25296885d67686b4331b8576994bf029baaea6a57e9b70e1c844a961b3bd3ee59539cef35bf1692802b7690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jsonschema-spec) python311-jsonschema-spec python3dist(jsonschema-spec)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-jsonschema python311-pathable python311-typing_extensions"

inherit rpm
