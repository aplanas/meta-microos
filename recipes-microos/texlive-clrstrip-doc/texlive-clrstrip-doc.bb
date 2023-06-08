SUMMARY = "Documentation for texlive-clrstrip"
DESCRIPTION = "This package includes the documentation for texlive-clrstrip"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn60363"

RPM_NAME = "texlive-clrstrip-doc-2023.201.svn60363-53.1.noarch.rpm"
RPM_HASH = "fb458c166c92eaf931643a09af1555d86007650ddb238e875f3dc3e4b6c2fdaa1bd75baefc99f9c94c1b0a218aed601a4440322497dc57c1eeff5f81568d4980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrstrip-doc"
RDEPENDS:${PN} += ""

inherit rpm
