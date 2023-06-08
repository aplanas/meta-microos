SUMMARY = "Documentation for texlive-auncial-new"
DESCRIPTION = "This package includes the documentation for texlive-auncial-new"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn62977"

RPM_NAME = "texlive-auncial-new-doc-2023.201.2.0svn62977-53.1.noarch.rpm"
RPM_HASH = "c2ca96ee399f4e9ff51f61efc9f841d4ce3e9a94c5581b8c8c8e1e859fd48a1f914c5bdf5172560c004a31b4271eee04ba3544a79ead145995c12e34df5ee467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auncial-new-doc"
RDEPENDS:${PN} += ""

inherit rpm
