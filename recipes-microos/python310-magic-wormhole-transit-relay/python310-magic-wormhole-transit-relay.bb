SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python310-magic-wormhole-transit-relay-0.2.1-3.5.noarch.rpm"
RPM_HASH = "fa2b566ecfbb1cd4e3f04f129a40abed892f55eb28edb1f5e0c5912bd1dde35386cfe896d8551bbc1b0ceb4dcc2382afceb3644eb54be27ac2b05c7639a80d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole-transit-relay \
python3.10dist(magic-wormhole-transit-relay) \
python310-magic-wormhole-transit-relay \
python3dist(magic-wormhole-transit-relay)"
RDEPENDS:${PN} += "python(abi) \
python310-Twisted"

inherit rpm
