SUMMARY = "Documentation for texlive-fcavtex"
DESCRIPTION = "This package includes the documentation for texlive-fcavtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn38074"

RPM_NAME = "texlive-fcavtex-doc-2023.201.1.1svn38074-52.1.noarch.rpm"
RPM_HASH = "d271cda01b21542b6c6e8da9d29c4eaa2805d74b74500bcc189ae00a2ab92354a27d65e92c51cc4561c4fff4c0e3c16656921dcfb8ce0d54f7170a7258c592ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-fcavtex-doc:pt) texlive-fcavtex-doc"
RDEPENDS:${PN} += ""

inherit rpm
