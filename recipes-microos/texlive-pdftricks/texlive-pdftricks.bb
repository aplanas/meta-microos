SUMMARY = "Support for PSTricks in pdfTeX"
DESCRIPTION = "The PSTricks macros cannot be used (directly) with pdfTeX, \
since PSTricks uses PostScript arithmetic, which isn't part of \
PDF. This package circumvents this limitation so that the \
extensive facilities offered by the powerful PSTricks package \
can be made use of in a pdfTeX document. This is done using the \
shell escape function available in current TeX implementations. \
The package may also be used in support of other \
'PostScript-output-only' packages, such as PSfrag. For \
alternatives, users may care to review the discussion in the \
PSTricks online documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.16svn15878"

RPM_NAME = "texlive-pdftricks-2023.201.1.16svn15878-51.1.noarch.rpm"
RPM_HASH = "f4238a244ad2ad4872588b76b3b215a4dd05c4a933dad4bf2eaa7d9337af80ea3aaf658d0ed06e5f3d737fd55c76e6d4f15f0852d76b46c0b4d195f69e739a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdftricks.sty) texlive-pdftricks"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(graphicx.sty) tex(keyval.sty) tex(moreverb.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
