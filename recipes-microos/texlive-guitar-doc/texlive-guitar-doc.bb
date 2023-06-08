SUMMARY = "Documentation for texlive-guitar"
DESCRIPTION = "This package includes the documentation for texlive-guitar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn32258"

RPM_NAME = "texlive-guitar-doc-2023.201.1.6svn32258-53.1.noarch.rpm"
RPM_HASH = "9decc67fe716d36c319d40c8c8c19857d11eb125e356582b72c5299dc7b1ee4701eea235858d859af204b8ae88fb314151d8267112a995bd7d50a6f83a15b98c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-guitar-doc"
RDEPENDS:${PN} += ""

inherit rpm
