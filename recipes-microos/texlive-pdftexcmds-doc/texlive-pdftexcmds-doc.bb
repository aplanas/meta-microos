SUMMARY = "Documentation for texlive-pdftexcmds"
DESCRIPTION = "This package includes the documentation for texlive-pdftexcmds"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.33svn55777"

RPM_NAME = "texlive-pdftexcmds-doc-2023.201.0.0.33svn55777-51.1.noarch.rpm"
RPM_HASH = "378a87ce7ef607e2fb207615ce980928fb004469e099da8233c473bb9eb870c2fbc4d9f26c5772bef94b2cea10eb5ea45e3224abd126a8e6601d5b4b389b33e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftexcmds-doc"
RDEPENDS:${PN} += ""

inherit rpm
