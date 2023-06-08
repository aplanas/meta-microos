SUMMARY = "Severed fonts for texlive-uhc"
DESCRIPTION = "The  separated fonts package for texlive-uhc"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn16791"

RPM_NAME = "texlive-uhc-fonts-2023.201.svn16791-53.1.noarch.rpm"
RPM_HASH = "bd0fc0de934ecc23c6441a56061e6ac7b93a6f3b495e2d26aa67e637750ce02305836f6c3233000881fb43e1e57ba413250247bd795be274de88d704d626011b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=bg) font(:lang=kum) font(:lang=os) font(:lang=ru) font(:lang=sel) font(umj00) font(umj01) font(umj02) font(umj03) font(umj04) font(umj05) font(umj10) font(umj11) font(umj12) font(umj13) font(umj14) font(umj15) font(umj16) font(umj17) font(umj20) font(umj21) font(umj22) font(umj23) font(umj24) font(umj25) font(umj26) font(umj27) font(umj28) font(umj29) font(umj30) font(umj31) font(umj32) font(umj33) font(umj34) font(umj35) font(umj36) font(umj37) font(umj38) texlive-uhc-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
