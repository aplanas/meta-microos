SUMMARY = "Documentation for texlive-thumbs"
DESCRIPTION = "This package includes the documentation for texlive-thumbs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0qsvn33134"

RPM_NAME = "texlive-thumbs-doc-2023.201.1.0qsvn33134-54.1.noarch.rpm"
RPM_HASH = "512df54cf625892ad98b2e1df99198113584c78d64491a16dd98cf0cdccd8ba8dc6bc2398edbbfa2c23e554250059b701d69dd9ac5acf5e8d4abfb0b3ac4e81f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumbs-doc"
RDEPENDS:${PN} += ""

inherit rpm
