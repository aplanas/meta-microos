SUMMARY = "Flow text around a figure"
DESCRIPTION = "Provides a Plain TeX macro \\figflow that allows one to insert a \
figure into an area inset into a paragraph. Command arguments \
are width and height of the figure, and the figure (and its \
caption) itself. Usage details are to be found in the TeX file \
itself. The package does not work with LaTeX; packages such as \
wrapfig, floatflt and picins support the needs of LaTeX users \
in this area."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21462"

RPM_NAME = "texlive-figflow-2023.201.svn21462-52.1.noarch.rpm"
RPM_HASH = "aa1285b89554520c46cda9b129bfe124d772dcbd20b52eefa893edd62ffdc01259fb5e2dabbaee8c2a601ffa9a8a4a2fc065cda1f1815645e6391dfd52cb5ebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(figflow.tex) \
texlive-figflow"
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
