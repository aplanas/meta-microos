SUMMARY = "Global warnings at the end of the logfile"
DESCRIPTION = "This package provides a command that generates a list of \
warnings that are printed out at the very end of the logfile. \
This is useful for warnings such as 'Rerun for this or that \
reason' or 'This is a draft, change it before the final run'."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn22028"

RPM_NAME = "texlive-warning-2023.201.0.0.01svn22028-53.1.noarch.rpm"
RPM_HASH = "6d6cf0749d3e1bfcb768ff474d7c7b73994fca8419e400ea1fc062b97e01539fb0e4b0dfc7e357aa195f46f4365c753295d83dd10835c92b990235de722a7a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(warning.sty) \
texlive-warning"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
