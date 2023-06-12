SUMMARY = "Documentation for texlive-phonenumbers"
DESCRIPTION = "This package includes the documentation for texlive-phonenumbers"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5svn63774"

RPM_NAME = "texlive-phonenumbers-doc-2023.201.2.5svn63774-51.1.noarch.rpm"
RPM_HASH = "3087e4b195ad878ed5911392bf81f3aded019f9c820e15f355ad9e2a4fde5948abc4e39718fdf08f40bdb1f1d194d0820db4848e00c33e95c1e9d4769f6bcbb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-phonenumbers-doc:de) \
texlive-phonenumbers-doc"
RDEPENDS:${PN} += ""

inherit rpm
