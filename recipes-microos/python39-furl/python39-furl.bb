SUMMARY = "A Python URL manipulation library"
DESCRIPTION = "furl is a Python library for parsing and manipulating URLs."
LICENSE = "Unlicense"

PV = "2.1.3"

RPM_NAME = "python39-furl-2.1.3-2.1.noarch.rpm"
RPM_HASH = "7c4a016a651de211ee3f6e9068b39479f942e269bf8864ea193ee3fa7dc63853554afb3153db1deddb31af7ea3520b09d559fc119901df8e2f886138f34cfe06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(furl) python39-furl python3dist(furl)"
RDEPENDS:${PN} += "python(abi) python39-orderedmultidict python39-six"

inherit rpm
