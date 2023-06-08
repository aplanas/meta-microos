SUMMARY = "Documentation for texlive-srcredact"
DESCRIPTION = "This package includes the documentation for texlive-srcredact"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn38710"

RPM_NAME = "texlive-srcredact-doc-2023.201.1.0svn38710-57.1.noarch.rpm"
RPM_HASH = "0fd5310e20010c5d466f6b4c33b7ed0f1ce5426b809b27282d13d9c651babea6ff33561fad73a2bab0e7ee628e145c1ee56aa50c8fd0623d6b8d9dc4e71fc10e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(srcredact.1) texlive-srcredact-doc"
RDEPENDS:${PN} += ""

inherit rpm
