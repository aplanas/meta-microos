SUMMARY = "Hungarian dummy text (Lorum ipse)"
DESCRIPTION = "Lorem ipsum is an improper Latin filler dummy text, cf. the \
lipsum package. It is commonly used for demonstrating the \
textual elements of a document template. Lorum ipse is a \
Hungarian variation of Lorem ipsum. (Lorum is a Hungarian card \
game, and ipse is a Hungarian slang word meaning bloke.) With \
this package you can typeset 150 paragraphs of Lorum ipse. All \
paragraphs are taken with permission from \
http://www.lorumipse.hu. Thanks to Lorum Ipse Lab (Viktor Nagy \
and David Takacs) for their work."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56848"

RPM_NAME = "texlive-hulipsum-2023.201.1.1svn56848-52.1.noarch.rpm"
RPM_HASH = "182990af7fb4650eae0b9b24964ae0be0d90f07157d434f04ef1fa1c806be23f7fe4051fe95dbd6e8ae575e6c2072a174a784cdcaab9197cb02d12d31ed90867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hulipsum.sty) \
texlive-hulipsum"
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
