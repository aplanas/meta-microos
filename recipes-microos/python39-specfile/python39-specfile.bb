SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python39-specfile-0.16.0-1.1.noarch.rpm"
RPM_HASH = "3a183f1fc84e174a43680e18ec6d8f2c251fd8e9a50e4158ef50b11105fedb088110e6d58941627738ec33debe8472adccbc510d232c9abac07f752b3c2c4c97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(specfile) python39-specfile python3dist(specfile)"
RDEPENDS:${PN} += "python(abi) python39-rpm python39-typing-extensions"

inherit rpm
