SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python310-pyyaml_env_tag-0.1-2.14.noarch.rpm"
RPM_HASH = "01be01bc37c0c4cb82ab019630acdf7af7968666ca519c665acb6283aad101ab5446a4afa65dd594edc1287556af25deb9ead8765ee0b30a8eeb2a108c811337"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyyaml_env_tag python3.10dist(pyyaml-env-tag) python310-pyyaml_env_tag python3dist(pyyaml-env-tag)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML"

inherit rpm
