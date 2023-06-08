SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python311-pyu2f-0.1.5a-5.1.noarch.rpm"
RPM_HASH = "1e56b9126686c74bd6515e93ade3634f27c4a6f2f73cabd11463a487d34c30e565d3dad17ed6836ed99dc0ac9c40c7c6484ec58b102830e5ea5a224dc95860d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyu2f) python311-pyu2f python3dist(pyu2f)"
RDEPENDS:${PN} += "python(abi) python311-six"

inherit rpm
