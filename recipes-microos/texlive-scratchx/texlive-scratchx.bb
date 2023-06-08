SUMMARY = "Include Scratch programs in LaTeX documents"
DESCRIPTION = "This package can be used to include every kind of Scratch \
program in LaTeX documents. This may be particularly useful for \
Math Teachers and IT specialists. The package depends on the \
following other LaTeX packages: calc, fp, ifsym, multido, tikz, \
xargs, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn44906"

RPM_NAME = "texlive-scratchx-2023.201.1.1svn44906-53.1.noarch.rpm"
RPM_HASH = "f9cbb0047c492fa22fa4e530646a20424c7909e91eed5217e6b4818c58e71e24a9a06fc973592f764aad98aea2b86b735792591a16ab55f61b41c7eea27cec92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ScratchX.sty) texlive-scratchx"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(fp.sty) tex(ifsym.sty) tex(ifthen.sty) tex(multido.sty) tex(xargs.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
