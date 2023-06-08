SUMMARY = "Documentation for texlive-uptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-uptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn65657"

RPM_NAME = "texlive-uptex-fonts-doc-2023.201.svn65657-53.1.noarch.rpm"
RPM_HASH = "2cb9a7baee21d15127457c5724b7c6d5c3c553bac4a10acf754a1772fd0ceffdc8f032d5db7da87012761360cbb8216b64e732d8985318487cb3cbb2745a5e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uptex-fonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
