SUMMARY = "Embed source files into the generated PDF"
DESCRIPTION = "The package provides a means of storing a project, without \
losing anything. It uses the embedfile package to attach to the \
generated PDF all files used in creating your project. In \
particular, it can embed images, external TeX files, external \
codes and"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn51177"

RPM_NAME = "texlive-embedall-2023.201.2.0svn51177-53.1.noarch.rpm"
RPM_HASH = "384817b87154dcb67289df27330b41d8a1da1e841559cf2dad72127d641db440b6a19eb65791db0702b4c3495be793ef1e718b4f10902d35b6020629d0c6b0fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(embedall.sty) \
texlive-embedall"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(currfile.sty) \
tex(embedfile.sty) \
tex(etoolbox.sty) \
tex(filehook.sty) \
tex(letltxmacro.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
