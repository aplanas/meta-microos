SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python39-pyyaml_env_tag-0.1-2.14.noarch.rpm"
RPM_HASH = "24bee40ecc1803cf84918c58337c66a07be992aee329f7157bbc578af0cef9863f7091e2f0c45ad1748a43958ffe5828ded0d11635f4fece83cbf18c615a1add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyyaml-env-tag) \
python39-pyyaml_env_tag \
python3dist(pyyaml-env-tag)"
RDEPENDS:${PN} += "python(abi) \
python39-PyYAML"

inherit rpm
