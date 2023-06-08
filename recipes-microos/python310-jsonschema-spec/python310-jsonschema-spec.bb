SUMMARY = "JSONSchema Spec with object-oriented paths"
DESCRIPTION = "JSONSchema Spec with object-oriented paths."
LICENSE = "Apache-2.0"

PV = "0.1.4"

RPM_NAME = "python310-jsonschema-spec-0.1.4-1.2.noarch.rpm"
RPM_HASH = "6721503d03b1bfa104b32dea6b9c0ceb198ea59f0cfac2fca9d888af8e1af7be6c767b74e155dae073126ba5152de56e2cb3cff45fd6d026aabbabf10479fc19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonschema-spec python3.10dist(jsonschema-spec) python310-jsonschema-spec python3dist(jsonschema-spec)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-jsonschema python310-pathable python310-typing_extensions"

inherit rpm
