SUMMARY = "Documentation for texlive-akletter"
DESCRIPTION = "This package includes the documentation for texlive-akletter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5isvn15878"

RPM_NAME = "texlive-akletter-doc-2023.201.1.5isvn15878-54.1.noarch.rpm"
RPM_HASH = "63537779f019c9182e7703f2f0a0437f4b7a10e45bc47662197526da924965b2815414d33ca00d203d39515844583e7bdc59aaba85390f8d12a37db7f0ff30d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-akletter-doc:de;en) texlive-akletter-doc"
RDEPENDS:${PN} += ""

inherit rpm
