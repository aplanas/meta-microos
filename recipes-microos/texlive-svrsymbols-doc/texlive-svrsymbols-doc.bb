SUMMARY = "Documentation for texlive-svrsymbols"
DESCRIPTION = "This package includes the documentation for texlive-svrsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-doc-2023.201.2.0bsvn50019-57.1.noarch.rpm"
RPM_HASH = "cae648c831c875f22f0b9eee29d250d9e42d4de4e185d118b898a9fa6bc0a865df130a49d2cb77e8c6c96f207794b6dd8faeb5375eebd6fd5fc31ac5972da3e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svrsymbols-doc"
RDEPENDS:${PN} += ""

inherit rpm
