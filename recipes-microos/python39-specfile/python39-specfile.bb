SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-specfile-0.18.0-1.1.noarch.rpm"
RPM_HASH = "0a81ec783dc1b6174da82ab22db237209157ff570cead74e9f6668cb75ecd51f92c440bba76273bbe616587f4881a6762759c58ee20c7ac2fdadfd359f5567e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(specfile) python39-specfile python3dist(specfile)"
RDEPENDS:${PN} += "python(abi) python39-rpm"

inherit rpm
