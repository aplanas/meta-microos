SUMMARY = "Template Text Parser"
DESCRIPTION = "TTP is a Python library for semi-structured text parsing using templates."
LICENSE = "MIT"

PV = "0.9.4"

RPM_NAME = "python39-ttp-0.9.4-1.1.noarch.rpm"
RPM_HASH = "3017a41f19f8324dd809fbd0307db87e1ac2c8dbf8bfbd09a6e2ca30cba7251194b94f7a58931870e3dc5f291d17a9e60e0f854a76fe418d125ffdff5abf30db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ttp) python39-ttp python3dist(ttp)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
