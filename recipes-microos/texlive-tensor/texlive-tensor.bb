SUMMARY = "Typeset tensors"
DESCRIPTION = "A package which allows the user to set tensor-style super- and \
subscripts with offsets between successive indices. It supports \
the typesetting of tensors with mixed upper and lower indices \
with spacing, also typset preposed indices. This is a complete \
revision and extension of the original 'tensor' package by Mike \
Piff."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-tensor-2023.201.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "e7eb3b9cf4e494b4928d8ffdd26373d1137adb6feb695186ceda06e7dfcea8215ec304aeab034ab9baa609a6d21cf61e2052ee65762da83c796e61e4e0fc9190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tensor.sty) texlive-tensor"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
