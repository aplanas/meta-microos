SUMMARY = "Documentation for texlive-cbfonts"
DESCRIPTION = "This package includes the documentation for texlive-cbfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-cbfonts-doc-2023.201.svn54080-52.1.noarch.rpm"
RPM_HASH = "fc18a8fdd5abdaf1f6bbc2eb6c5f7f7cbe0e37de9b783e6c2fe6eb9f77701b99d319653b9f769eb3a8fe587d58f8de4028edc9a773192f7958261324c4c1d994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbfonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
