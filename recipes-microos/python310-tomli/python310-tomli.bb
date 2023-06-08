SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-tomli-2.0.1-2.1.noarch.rpm"
RPM_HASH = "36a68993dfa83fbfc7f3c197587c292e1ea898158015505b7a8bbe11ad2ca90718dd8a4655ab265ea53c65c42c00231b159a15a829ee48e6c1faae34c11ea594"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomli python3.10dist(tomli) python310-tomli python3dist(tomli)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
