SUMMARY = "Avoid name clashes with e-TeX commands"
DESCRIPTION = "New primitive commands are introduced in e-TeX; sometimes the \
names collide with existing macros. This package solves the \
name clashes by adding a prefix to e-TeX's commands. For \
example, eTeX's \\unexpanded is provided as \\etex@unexpanded."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn53171"

RPM_NAME = "texlive-etexcmds-2023.201.1.7svn53171-52.1.noarch.rpm"
RPM_HASH = "4905ff7f0deb6208d36c9cde74da005e8a639acb464b8924c007bca4c0954a64451dfb49b1729870f10c836f2adcb9a36cf287b1617466e0e0d7a1d4513b883d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(etexcmds.sty) \
texlive-etexcmds"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(infwarerr.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
