SUMMARY = "Binary files of latex-git-log"
DESCRIPTION = "Binary files of latex-git-log"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30983"

RPM_NAME = "texlive-latex-git-log-bin-2023.20230311.svn30983-91.1.aarch64.rpm"
RPM_HASH = "347d97d4ff87a3b27dc1fe78d48fb96db60dd5c23aa7c939a1d72c9cad0faf1b34b3a27d546d6d19a5dffd2038500b85426d47f0c5a6c6acd91ef80bf9af7e60"

RPROVIDES:${PN} += "texlive-latex-git-log-bin texlive-latex-git-log-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex-git-log"

inherit rpm
