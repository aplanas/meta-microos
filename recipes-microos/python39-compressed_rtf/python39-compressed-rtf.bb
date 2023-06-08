SUMMARY = "Compressed Rich Text Format (RTF) compression and decompression package"
DESCRIPTION = "Compressed Rich Text Format (RTF) compression and decompression package"
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "python39-compressed_rtf-1.0.6-1.8.noarch.rpm"
RPM_HASH = "3cfab0f033ac020db86e6e818c87c71c749a9392ca5c8104005302bfbceb736f6bba88564b2c78099200dac6a212e69e5101297a5bfd9f5b8ef4c06b24edda8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(compressed-rtf) python39-compressed_rtf python3dist(compressed-rtf)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
