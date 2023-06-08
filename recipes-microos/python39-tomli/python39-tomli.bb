SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-tomli-2.0.1-2.1.noarch.rpm"
RPM_HASH = "a3761111b8973e3298abd3bdff2ee3dd78aff65cf837ed7d19e9e11b1f2967fcd2398dd529a4c7d5aa88f616bf63bce64a0bcf6bb36cfb3c8123f94fb6f012bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tomli) python39-tomli python3dist(tomli)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
