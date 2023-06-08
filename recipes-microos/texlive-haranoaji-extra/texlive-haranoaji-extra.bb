SUMMARY = "Harano Aji Fonts"
DESCRIPTION = "Harano Aji Fonts (Harano Aji Mincho and Harano Aji Gothic) are \
fonts obtained by replacing Adobe-Identity-0 (AI0) CIDs of \
Source Han fonts (Source Han Serif and Source Han Sans) with \
Adobe-Japan1 (AJ1) CIDs. There are 14 fonts, 7 weights each for \
Mincho and Gothic."
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-2023.201.20230223svn66115-53.1.noarch.rpm"
RPM_HASH = "f1c4fe64e1b301cb57551d2253b2db75c3a7271daedad521838cca37c73486b996520fcbf8cb9914865463f924f3da16f67bd9d3921978bc0a85f8a1a48b76b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-haranoaji-extra-fonts texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
