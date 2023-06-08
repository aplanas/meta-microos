SUMMARY = "Documentation for texlive-conv-xkv"
DESCRIPTION = "This package includes the documentation for texlive-conv-xkv"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn43558"

RPM_NAME = "texlive-conv-xkv-doc-2023.204.svn43558-54.1.noarch.rpm"
RPM_HASH = "a412cf21c7726ce8a6d88b9f2d64935e65e27169b758ee0f593cec046df4f0b78df0508a29509600354f9124ea2951721f73057dd89fd66fb56c9bbaf106451c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conv-xkv-doc"
RDEPENDS:${PN} += ""

inherit rpm
