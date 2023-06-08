SUMMARY = "Documentation for texlive-refcount"
DESCRIPTION = "This package includes the documentation for texlive-refcount"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn53164"

RPM_NAME = "texlive-refcount-doc-2023.201.3.6svn53164-53.1.noarch.rpm"
RPM_HASH = "57ec2d633137b617fd4a1a48bce8c59199874178895cafd3c5d786fd54b39e6f9a716c66ab26545255bd569063ed1e8f0580ff7b4145b00778e81d1f6a9fbec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-refcount-doc"
RDEPENDS:${PN} += ""

inherit rpm
