SUMMARY = "Babel support for Polish"
DESCRIPTION = "The package provides the language definition file for support \
of Polish in babel. Some shortcuts are defined, as well as \
translations to Polish of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn62680"

RPM_NAME = "texlive-babel-polish-2023.201.1.3svn62680-53.1.noarch.rpm"
RPM_HASH = "047e0195c41f1b8615d79c4e8d34b32d61ae56af6464330f998e72c9589d9cf529e7975083ca27ae9269f91a197649daafb7e27877af7e368f6c31d52906428d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(polish-compat.ldf) \
tex(polish.ldf) \
texlive-babel-polish"
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
