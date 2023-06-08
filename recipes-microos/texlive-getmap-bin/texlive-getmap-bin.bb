SUMMARY = "Binary files of getmap"
DESCRIPTION = "Binary files of getmap"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn34971"

RPM_NAME = "texlive-getmap-bin-2023.20230311.svn34971-89.1.aarch64.rpm"
RPM_HASH = "4c3de53294ad864d2ac3d5777cf15aea2313e94462c350e5402b6b5507f8ee28ba0b9f387ee35abdcc6b7591ab4d8f899d7d325a81f28dd9392bb2c7b1184868"

RPROVIDES:${PN} += "texlive-getmap-bin texlive-getmap-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-getmap"

inherit rpm
