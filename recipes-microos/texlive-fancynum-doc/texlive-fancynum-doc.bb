SUMMARY = "Documentation for texlive-fancynum"
DESCRIPTION = "This package includes the documentation for texlive-fancynum"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn15878"

RPM_NAME = "texlive-fancynum-doc-2023.201.0.0.92svn15878-52.1.noarch.rpm"
RPM_HASH = "daa46504d21aa37d8a0ffe424bab7b798df05456d86c1579cb8505c315d2e35c9db1c76b9b93fbedbed630eefe4594a83f5d1418cfc176a4584270ac03368eb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancynum-doc"
RDEPENDS:${PN} += ""

inherit rpm
