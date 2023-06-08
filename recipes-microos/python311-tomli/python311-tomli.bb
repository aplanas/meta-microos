SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-tomli-2.0.1-2.1.noarch.rpm"
RPM_HASH = "f890c62cbc15b82303458249a377200f21fe9e24ba0e8512e6adc88b3bed3238c60a0580a0625e020f91d91f7a976b9eb8be9888a7954ef9cdc6de6397e1d6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tomli) python311-tomli python3dist(tomli)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
