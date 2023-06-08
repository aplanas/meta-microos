SUMMARY = "Documentation for texlive-tabulary"
DESCRIPTION = "This package includes the documentation for texlive-tabulary"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10svn34368"

RPM_NAME = "texlive-tabulary-doc-2023.201.0.0.10svn34368-54.1.noarch.rpm"
RPM_HASH = "ab0cea858408f8dcfa6c6499dedae1b8d5f2b42554e1640af6d06b2b51e87b54b8d83193f32726ea256853a9abd208f46b9e6b4587bcc014d5ce1ef5029d0d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabulary-doc"
RDEPENDS:${PN} += ""

inherit rpm
