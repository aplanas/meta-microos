SUMMARY = "Documentation for texlive-widows-and-orphans"
DESCRIPTION = "This package includes the documentation for texlive-widows-and-orphans"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0esvn66532"

RPM_NAME = "texlive-widows-and-orphans-doc-2023.201.1.0esvn66532-53.1.noarch.rpm"
RPM_HASH = "e9c5f0df289cd86fd0d057dccb7fc5e6935b30696666c9ee1c2c5c196fc71aff978cd59d6a7c96d2eafbc72b8e0b281899953f28dd7a0e779f05db5fc0c5db3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-widows-and-orphans-doc"
RDEPENDS:${PN} += ""

inherit rpm
