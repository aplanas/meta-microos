SUMMARY = "University of Washington thesis class"
DESCRIPTION = "The uwthesis package"
LICENSE = "Apache-1.0"

PV = "2023.201.6.13svn15878"

RPM_NAME = "texlive-uwthesis-2023.201.6.13svn15878-53.1.noarch.rpm"
RPM_HASH = "bd6bac86784701955b9b1fb577394f1deb9d20901b600f4a22867997229fde582b369b01e51299e1adc323123b457c7ad1e65a1c86f780a43bc686ac8f15bbc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uwthesis.cls) texlive-uwthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(book.cls) tex(natbib.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
