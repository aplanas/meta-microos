SUMMARY = "Type 1 versions of Amharic fonts"
DESCRIPTION = "These fonts are drop-in Adobe type 1 replacements for the fonts \
of the ethiop package."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-ethiop-t1-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "5028b740e355cce7f8f93b216658f36ef30e1488e427363f1499629d6f3e8520bff9f085949353c39ad044f45031ace63a5d148a0adf6e667187ea60ce378a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ethiop.map) texlive-ethiop-t1"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-ethiop-t1-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
