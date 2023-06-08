SUMMARY = "Documentation for texlive-cm"
DESCRIPTION = "This package includes the documentation for texlive-cm"
LICENSE = "SUSE-TeX"

PV = "2023.201.svn57963"

RPM_NAME = "texlive-cm-doc-2023.201.svn57963-53.1.noarch.rpm"
RPM_HASH = "fb833b091116b42bcd1eac75c4cc590c217fc7b08a86caf70fcf8f15b3312090722036858259c6b699d38da8659bcc01f38c0e5fe440b699fb84d4f18d5dce09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cm-doc"
RDEPENDS:${PN} += ""

inherit rpm
