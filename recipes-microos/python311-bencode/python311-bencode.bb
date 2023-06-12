SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python311-bencode-4.0.0-1.2.noarch.rpm"
RPM_HASH = "4df4417981fa6f8a3ad74507a0edda5ec257d4f9b019c2f8ff368759b82b9397b805945004620d3a1f2e50d770d81486197536a2d9903ab0d60c56b181570e71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bencode.py) \
python311-bencode \
python3dist(bencode.py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
