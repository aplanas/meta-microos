SUMMARY = "Support for German typography"
DESCRIPTION = "Supports the old German orthography (alte deutsche \
Rechtschreibung)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5esvn42428"

RPM_NAME = "texlive-german-2023.201.2.5esvn42428-52.1.noarch.rpm"
RPM_HASH = "eebc7779a165e28ec5ebe8c3c961e144e16ee375a13f31be3fdbeec38ffbd2850745a3b4e2f5d9e2a2985b56ae6144ea07318d25029074a36fd133c7442b2305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(german.sty) tex(ngerman.sty) texlive-german"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
