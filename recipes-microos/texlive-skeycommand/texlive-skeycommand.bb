SUMMARY = "Create commands using parameters and keyval in parallel"
DESCRIPTION = "The package provides tools for defining LaTeX commands and \
environments using combinations of parameters and keys. All the \
facilities of the ltxkeys and skeyval packages are available to \
the user of skeycommand."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn24652"

RPM_NAME = "texlive-skeycommand-2023.201.0.0.4svn24652-57.1.noarch.rpm"
RPM_HASH = "193267ed00f9373df070aa89e412fb7d4cf96ac5331e47466c05e80b37db9dda7f90d284125c15a7216ca69f9b96342b827fae94462ba101d12d47413a52b4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(skeycommand.sty) \
texlive-skeycommand"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(catoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
