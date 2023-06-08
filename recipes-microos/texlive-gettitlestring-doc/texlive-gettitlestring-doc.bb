SUMMARY = "Documentation for texlive-gettitlestring"
DESCRIPTION = "This package includes the documentation for texlive-gettitlestring"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53170"

RPM_NAME = "texlive-gettitlestring-doc-2023.201.1.6svn53170-52.1.noarch.rpm"
RPM_HASH = "51225cfcf2b6a20a4eefe87dc3244724c9adc745b67278c3144e88390ed7b8deef8bd909caf4962f98c9706c22e9264293a081a0062c42a0b4a73aeb1e6042af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gettitlestring-doc"
RDEPENDS:${PN} += ""

inherit rpm
