SUMMARY = "Documentation for texlive-mucproc"
DESCRIPTION = "This package includes the documentation for texlive-mucproc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn43445"

RPM_NAME = "texlive-mucproc-doc-2023.201.1.02svn43445-54.1.noarch.rpm"
RPM_HASH = "cd2d48f9999845df293afc2d5553c8197e88283306072ab9d5986de081a25e1820abbcac646687132b94c1340cfd45738b048fff2aa5da215db934b6ae5ef0e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mucproc-doc"
RDEPENDS:${PN} += ""

inherit rpm
