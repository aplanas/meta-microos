SUMMARY = "Documentation for texlive-innerscript"
DESCRIPTION = "This package includes the documentation for texlive-innerscript"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn57672"

RPM_NAME = "texlive-innerscript-doc-2023.201.1.1svn57672-52.1.noarch.rpm"
RPM_HASH = "a9b22811f679967902475f448088639b4aef912af95b6b03e96b15a5660eedd40afd6b644a55328301ce05dcfdaf633e76262c00f0374dbadb24bbfe01f559d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-innerscript-doc"
RDEPENDS:${PN} += ""

inherit rpm
