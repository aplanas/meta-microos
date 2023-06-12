SUMMARY = "A variable-width \\parbox command"
DESCRIPTION = "Defines a command \\pbox{<max width>}{<text>} which adjusts its \
width to that of the enclosed text, up to the maximum width \
given. The package also defines some associated length \
commands."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2svn24807"

RPM_NAME = "texlive-pbox-2023.201.1.2svn24807-51.1.noarch.rpm"
RPM_HASH = "f6d35a3a644da55825a5170bb9a3754b24b618d0211c295628872f75f52965fa8bcb9589fa2fb793090e8d9d3d486eedf14fed34ec1a9c7f2a0aea10e3d2970f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pbox.sty) \
texlive-pbox"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
