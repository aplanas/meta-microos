SUMMARY = "Documentation for texlive-njustthesis"
DESCRIPTION = "This package includes the documentation for texlive-njustthesis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.0.1svn62451"

RPM_NAME = "texlive-njustthesis-doc-2023.201.0.0.0.1svn62451-54.1.noarch.rpm"
RPM_HASH = "0210b4caa698663cf5574250314c55ddc1823121e1618be81bb0e703e6eee3da350b3594c6bc014aa787f960daaa55f869c9d0e98eddc18bc207a1233219272e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-njustthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
