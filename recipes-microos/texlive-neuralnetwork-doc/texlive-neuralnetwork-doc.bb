SUMMARY = "Documentation for texlive-neuralnetwork"
DESCRIPTION = "This package includes the documentation for texlive-neuralnetwork"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn31500"

RPM_NAME = "texlive-neuralnetwork-doc-2023.201.1.0svn31500-54.1.noarch.rpm"
RPM_HASH = "272803fe9e0482d303e17b38588625497b069fddf5f45ddd30cc311f8e91a03c681ef2042ffcf99a4409f2f2ab8698dba942242a0215d493c83be0b0c04d791f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-neuralnetwork-doc"
RDEPENDS:${PN} += ""

inherit rpm
