SUMMARY = "Dimens for picture macros"
DESCRIPTION = "There are macro and environment arguments that expect numbers \
that will internally be multiplied by \\unitlength. This package \
extends the syntax of these arguments, so that dimensions with \
calculation support may be used for these arguments."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54867"

RPM_NAME = "texlive-picture-2023.201.1.6svn54867-51.1.noarch.rpm"
RPM_HASH = "19855f6fc3ab1d3ffbfec8fedd543f58ebae5ec3cb94f293ff00c0fd43db0a951a199a576b7f1a8e66affdf4669e10563fedc0c8b97f9ef738808bafd36c512c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(picture.sty) texlive-picture"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
