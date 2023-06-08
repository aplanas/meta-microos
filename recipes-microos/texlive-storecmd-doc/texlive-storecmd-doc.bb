SUMMARY = "Documentation for texlive-storecmd"
DESCRIPTION = "This package includes the documentation for texlive-storecmd"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.2svn24431"

RPM_NAME = "texlive-storecmd-doc-2023.201.0.0.0.2svn24431-57.1.noarch.rpm"
RPM_HASH = "46ab0af4d1b64388087d7ac26fbc8f8175d560c4ad106b62285720a6e7fa8f9cca71466ccb96d283030ea93e43de695c39df0dd083ffdf67d9793d53030fad48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-storecmd-doc"
RDEPENDS:${PN} += ""

inherit rpm
