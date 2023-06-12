SUMMARY = "Documentation for texlive-pst-eucl"
DESCRIPTION = "This package includes the documentation for texlive-pst-eucl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.75svn56474"

RPM_NAME = "texlive-pst-eucl-doc-2023.201.1.75svn56474-52.1.noarch.rpm"
RPM_HASH = "4a1adbd76b5664971eed479e9d434aba117d40b7abc52cb15a1eca970881ea4bec9c62bab138a0e3f3feaf14526cce326de31923991597154ca3e6d675b6e530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-eucl-doc:en) \
texlive-pst-eucl-doc"
RDEPENDS:${PN} += ""

inherit rpm
