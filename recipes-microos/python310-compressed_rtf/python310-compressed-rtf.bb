SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python310-compressed_rtf-1.0.6-1.8.noarch.rpm"
RPM_HASH = "07b69d044feaefa1360495160ece2fb9ed7f52ea83bb978235e723de740a2f4f0597ebd3b09c926ec62c9c9579827f0559c5c5aac7c80a1844adfaa998644a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-compressed_rtf python3.10dist(compressed-rtf) python310-compressed_rtf python3dist(compressed-rtf)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
