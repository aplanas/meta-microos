SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python311-tmx-1.10-3.14.noarch.rpm"
RPM_HASH = "7ad64998669e9615224d53feed18678a6ed76a2530f5d0ef2b3aa1eacca472d6d9e2110e1a1bdfebfbcdfd81816074f3a6d06163395f8a8305982adefe0e8553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tmx) \
python311-tmx \
python3dist(tmx)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm
