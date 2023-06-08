SUMMARY = "Documentation for texlive-xetex-tibetan"
DESCRIPTION = "This package includes the documentation for texlive-xetex-tibetan"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn28847"

RPM_NAME = "texlive-xetex-tibetan-doc-2023.201.0.0.1svn28847-52.1.noarch.rpm"
RPM_HASH = "2f61e465314daf64fc53b90112eb5b4d36b14c5a8cc15814ec79c8990ab0fc487fbe919c81f2a05891465678026bcd6b46491f208e9695e6b0739b5719787f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetex-tibetan-doc"
RDEPENDS:${PN} += ""

inherit rpm
