SUMMARY = "Python YAML parser"
DESCRIPTION = "ruamel.yaml is a YAML parser/emitter that supports roundtrip preservation \
of comments, seq/map flow style, and map key order."
LICENSE = "MIT"

PV = "0.17.21"

RPM_NAME = "python39-ruamel.yaml-0.17.21-2.1.noarch.rpm"
RPM_HASH = "1d1e6c2ab5ee814f670ff2d198e78628acc3bc261a889f951382d38e25e0b5f369468283ef2ceec774793e7abe0f781f01f4bab05efd89125729d1dfec7b029b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ruamel.yaml) python39-ruamel.yaml python3dist(ruamel.yaml)"
RDEPENDS:${PN} += "python(abi) python39-ruamel.yaml.clib"

inherit rpm
