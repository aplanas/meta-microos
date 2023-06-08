SUMMARY = "Documentation for texlive-pageslts"
DESCRIPTION = "This package includes the documentation for texlive-pageslts"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2fsvn39164"

RPM_NAME = "texlive-pageslts-doc-2023.201.1.2fsvn39164-51.1.noarch.rpm"
RPM_HASH = "a5e343aeb1a789d799f739a083f496c14f40e8cff3b7c0077285176a4479b2094d5e895b33b0dac37d8f6292b96cac9ddae48ce60116f2a70fa047bcd41bec09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pageslts-doc"
RDEPENDS:${PN} += ""

inherit rpm
