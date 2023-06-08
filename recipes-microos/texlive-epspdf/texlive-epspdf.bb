SUMMARY = "Converter for PostScript, EPS and PDF"
DESCRIPTION = "Epspdftk.tcl is a GUI ps/eps/pdf converter. Epspdf.tlu, its \
command-line backend, can be used by itself. Options include \
grayscaling, cropping margins and single-page selection. Some \
conversion options are made possible by converting in multiple \
steps."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6.5.1svn66115"

RPM_NAME = "texlive-epspdf-2023.201.0.0.6.5.1svn66115-53.1.noarch.rpm"
RPM_HASH = "a34f7e036193b3ae8d6807685dc8b1690c000be081e11d8e41305e44de7158da038181740c6da96077d93c7045533a1b81dadc16a9ffaa2250c633b55499bf54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdf"
RDEPENDS:${PN} += "/bin/sh /usr/bin/texlua /usr/bin/wish coreutils ed findutils grep sed texlive texlive-epspdf-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
