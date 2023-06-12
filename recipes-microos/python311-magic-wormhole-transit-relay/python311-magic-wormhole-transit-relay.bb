SUMMARY = "Transit Relay server for Magic-Wormhole"
DESCRIPTION = "Transit Relay server for Magic-Wormhole"
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python311-magic-wormhole-transit-relay-0.2.1-3.5.noarch.rpm"
RPM_HASH = "8f32c1ae0bd3a58c3c6d04912c7d2021729cc74a657a8f632342c6443e55dd0a1ffef9cd8789286781e7aa5041a5f7864525e8e33a91acc256a8ca38d9e01aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(magic-wormhole-transit-relay) \
python311-magic-wormhole-transit-relay \
python3dist(magic-wormhole-transit-relay)"
RDEPENDS:${PN} += "python(abi) \
python311-Twisted"

inherit rpm
