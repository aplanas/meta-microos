SUMMARY = "The kitchen sink of Python functional utility libraries"
DESCRIPTION = "The kitchen sink of Python utility libraries for doing 'stuff' in a functional way. \
Based on the Lo-Dash Javascript library."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python39-pydash-5.1.0-1.6.noarch.rpm"
RPM_HASH = "4c4427fad5e8a116492302d91232e38bf6872d12fac07d3d00433c2394e745d0e70a0b0d8258d059289852893d4c307de2353e858ffc79b1b057aa619a6a0082"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydash) python39-pydash python3dist(pydash)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
