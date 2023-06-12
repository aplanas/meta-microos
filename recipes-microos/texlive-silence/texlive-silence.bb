SUMMARY = "Selective filtering of error messages and warnings"
DESCRIPTION = "The package allows the user to filter out unwanted warnings and \
error messages issued by LaTeX, packages and classes, so they \
won't pop out when there's nothing one can do about them. \
Filtering goes from the very broad ('avoid all messages by such \
and such') to the fine-grained ('avoid messages that begin \
with...'). Messages may be saved to an external file for later \
reference."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5bsvn27028"

RPM_NAME = "texlive-silence-2023.201.1.5bsvn27028-53.1.noarch.rpm"
RPM_HASH = "4d0f90bcb55819a3257e44f5047e03a05d17e47f396794f4e7fe6c9b4a497fec7c0da100cfed118791ecd35f86160cf290c0de3ca5c15c416a685a324a2f75ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(silence.sty) \
texlive-silence"
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
