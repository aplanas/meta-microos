SUMMARY = "Documentation for texlive-bxjalipsum"
DESCRIPTION = "This package includes the documentation for texlive-bxjalipsum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn66013"

RPM_NAME = "texlive-bxjalipsum-doc-2023.201.1.0svn66013-52.1.noarch.rpm"
RPM_HASH = "a27c83b985548074604ebd806871c16fb3a0cb1d99fe0de3a1492824a31131bb4eece98c9c327d401dae75258730b84295d3c7dae8851139b7fa311b8e3db1fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxjalipsum-doc"
RDEPENDS:${PN} += ""

inherit rpm
