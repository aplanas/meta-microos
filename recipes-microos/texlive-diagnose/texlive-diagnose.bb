SUMMARY = "A diagnostic tool for a TeX installation"
DESCRIPTION = "Provides macros to assist evaluation of the capabilities of a \
TeX installation (i.e., what extensions it supports). An \
example document that examines the installation is available."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn19387"

RPM_NAME = "texlive-diagnose-2023.201.0.0.2svn19387-52.1.noarch.rpm"
RPM_HASH = "5256f32715ed416f58c792e09506e39d28940709512d2244ab2d3856066944198fdcd99a0d7df59319bbc41a00b0703ddd449233d2b322b60fe0e8f2c7375ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(diagnose.sty) \
texlive-diagnose"
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
