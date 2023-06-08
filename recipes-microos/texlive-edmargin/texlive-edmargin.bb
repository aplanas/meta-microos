SUMMARY = "Multiple series of endnotes for critical editions"
DESCRIPTION = "Edmargin provides a very simple scheme for endnote sections for \
critical editions. Endnotes can either be marked in the text, \
or with marginal references to the page in the note sections \
where the note is to be found. Notes can be set in individual \
paragraphs, or in block paragraph mode (where there are many \
short notes). Note sections will have running headers of the \
form 'Textual notes to pp. xx--yy'. New note sections can be \
created on the fly. There are predefined endnote sections for \
textual notes, emendations, and explanatory notes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn27599"

RPM_NAME = "texlive-edmargin-2023.201.1.2svn27599-53.1.noarch.rpm"
RPM_HASH = "40eea07238ae765405b9a411f06075247d0b91027a16883c8c53db4d0292118455308726f6de235e80bb5ec2d1f75d2a0629fee9fedf20b522e999aa11030427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(edmargin.sty) texlive-edmargin"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
