SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python310-specfile-0.16.0-1.1.noarch.rpm"
RPM_HASH = "78f2a2dd034f73a7cc07d9c089d4d89798a1ee840a68c3f443df42970c2a7fb954377a63d265e4b5be9640a9a5931c333b4b76632746192d282485ce2522feb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-specfile python3.10dist(specfile) python310-specfile python3dist(specfile)"
RDEPENDS:${PN} += "python(abi) python310-rpm python310-typing-extensions"

inherit rpm
