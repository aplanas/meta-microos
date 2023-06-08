SUMMARY = "Binary files of git-latexdiff"
DESCRIPTION = "Binary files of git-latexdiff"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn54732"

RPM_NAME = "texlive-git-latexdiff-bin-2023.20230311.svn54732-89.1.aarch64.rpm"
RPM_HASH = "654d593cbae7a034e9085de17bfa9e122b92299df2c9b2bf2735bcab42ecb7d2131ab0e808847b2d028071f9f49e6c2969c716ad09600496fa1c956f57c423ea"

RPROVIDES:${PN} += "texlive-git-latexdiff-bin texlive-git-latexdiff-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-git-latexdiff"

inherit rpm
