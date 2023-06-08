SUMMARY = "Show for approval the filenames used in \\input, \\openin, or \\openout"
DESCRIPTION = "This package provides macros to make the file I/O in plain TeX \
more transparent. That is, every \\input, \\openin, and \\openout \
operation by TeX is presented to the user who must check \
carefully if the file name of the source is acceptable. The \
user must sometimes enter additional text and has to specify \
the file name that the TeX operation should use. The macros \
require a complex installation procedure; the package contains \
sed and bash scripts to do this on a UNIX-like operating \
system. Every installation is different from any other as \
password-protected macro names and private messages have to be \
chosen by the installer. Therefore, the files in the package \
cannot be used directly. The files carry the extension .org, \
and only after the user has performed an individual \
customization for a private installation the changed files are \
renamed and have the extension .tex. For details see the \
manual."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64113"

RPM_NAME = "texlive-transparent-io-2023.201.svn64113-52.1.noarch.rpm"
RPM_HASH = "d58abbf2f12f001362523d230e091668654de61131aeae2492af30ddfb45c3b859b85eada28aa5e97b037aabd5922f711a89df8a4351ac1cb74725a40c6c6a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-transparent-io"
RDEPENDS:${PN} += "/bin/bash /bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
