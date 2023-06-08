SUMMARY = "Macros for maintaining colour stacks under pdfTeX"
DESCRIPTION = "Since version 1.40 pdfTeX supports colour stacks. The driver \
file pdftex.def for package color defines and uses a main \
colour stack since version v0.04b. This package is intended for \
package writers. It defines macros for setting and maintaining \
new colour stacks."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn64469"

RPM_NAME = "texlive-pdfcol-2023.201.1.7svn64469-51.1.noarch.rpm"
RPM_HASH = "44af44dde498cdaa171f7998dff861cfd0d9d4052e6851368789d34b4fa7e0d00a47970bac1041f9c7db83ddc53732c4a94cf1aedb8db90a3213d587fb1993ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfcol.sty) texlive-pdfcol"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
