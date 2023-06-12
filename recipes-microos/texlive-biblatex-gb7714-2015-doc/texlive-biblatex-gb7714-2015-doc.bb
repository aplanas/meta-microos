SUMMARY = "Documentation for texlive-biblatex-gb7714-2015"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-gb7714-2015"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1ksvn64967"

RPM_NAME = "texlive-biblatex-gb7714-2015-doc-2023.201.1.1ksvn64967-53.1.noarch.rpm"
RPM_HASH = "614c79e229f5e7f357b5c32552f9956ef0e3cbd9a03e0b74222b69dfcb4a12a26e989e23d904d9d5ed9d5734fbf32b88ca240dfb25abe41da6611afb8a27b921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-gb7714-2015-doc:zh) \
texlive-biblatex-gb7714-2015-doc"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
