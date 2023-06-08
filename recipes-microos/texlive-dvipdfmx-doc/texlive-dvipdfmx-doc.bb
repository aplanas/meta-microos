SUMMARY = "Documentation for texlive-dvipdfmx"
DESCRIPTION = "This package includes the documentation for texlive-dvipdfmx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-dvipdfmx-doc-2023.201.svn66203-53.1.noarch.rpm"
RPM_HASH = "c516d3d938021ab0296725ed7bb3cff05052b2113fc6294621a3c98c86e0094bab768fd044ff217d7f20c32c9d594e5fb7c8092ebb9381abfa68917c3a03ec7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(dvipdfm.1) man(dvipdfmx.1) man(dvipdft.1) man(ebb.1) man(extractbb.1) man(xdvipdfmx.1) texlive-dvipdfmx-doc"
RDEPENDS:${PN} += ""

inherit rpm
