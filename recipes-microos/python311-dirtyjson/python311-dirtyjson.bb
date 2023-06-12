SUMMARY = "Python JSON decoder that can extract data from dirty input"
DESCRIPTION = "JSON decoder for Python that can extract data from dirty input."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python311-dirtyjson-1.0.8-1.3.noarch.rpm"
RPM_HASH = "e0c9f519715bfe168df39cc001b90a3cc919682156da6e6548fb859d92b5efd481c65d7149e43a09270d111de10a3838c28af5829c5a05a66e9c2202eed5b61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dirtyjson) \
python311-dirtyjson \
python3dist(dirtyjson)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
