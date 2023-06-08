SUMMARY = "Documentation for texlive-datetime2-catalan"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-catalan"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47032"

RPM_NAME = "texlive-datetime2-catalan-doc-2023.201.1.1svn47032-52.1.noarch.rpm"
RPM_HASH = "987942a4859abce81adaf37a4a186b48d6148950daa455dae733e8b8397f9e796d8dbfc6d38987204d13cbf57b1d8b726fcfc6d1d5878a07530a69429ccf2724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-catalan-doc"
RDEPENDS:${PN} += ""

inherit rpm
