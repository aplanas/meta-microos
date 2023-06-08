SUMMARY = "Documentation for texlive-wasy-type1"
DESCRIPTION = "This package includes the documentation for texlive-wasy-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-doc-2023.201.001.002svn53534-53.1.noarch.rpm"
RPM_HASH = "ca41249e4132362b9211148887d0c1a89900684c1aac56d8de631595ff363b9cd6a74bfcc70ef35a26bf504e90346114b756b3ef460f547b3b34e881b8741b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasy-type1-doc"
RDEPENDS:${PN} += ""

inherit rpm
