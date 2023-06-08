SUMMARY = "Binary files of latex-git-log"
DESCRIPTION = "Binary files of latex-git-log"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30983"

RPM_NAME = "texlive-latex-git-log-bin-2023.20230311.svn30983-89.1.aarch64.rpm"
RPM_HASH = "db7bf1d71e59c17e62b2100d702f34788a9d6b74925f1f72e0dacc8dbc2642a47d269c089aaecf2c53f424ded9c250cbfb7926062b19467db93e73ca59063d38"

RPROVIDES:${PN} += "texlive-latex-git-log-bin texlive-latex-git-log-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex-git-log"

inherit rpm
