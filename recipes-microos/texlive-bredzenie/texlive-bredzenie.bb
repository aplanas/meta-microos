SUMMARY = "A Polish version of 'lorem ipsum...' in the form of a LaTeX package"
DESCRIPTION = "This is a polish version of the classic pseudo-Latin 'lorem \
ipsum dolor sit amet...'. It provides access to several \
paragraphs of pseudo-Polish generated with Hidden Markov Models \
and Recurrent Neural Networks trained on a corpus of Polish."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44371"

RPM_NAME = "texlive-bredzenie-2023.201.1.0svn44371-52.1.noarch.rpm"
RPM_HASH = "15b309aa5a7250efec2b16d2aeee417040f36212b3d5eae199857786be0cfc49c97ed00ec40e816bf4acfde4cea546765eb46e4980b96482bdb7beacceefc934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bredzenie.sty) \
texlive-bredzenie"
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
