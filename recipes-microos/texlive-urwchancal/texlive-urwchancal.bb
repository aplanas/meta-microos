SUMMARY = "Use URW's clone of Zapf Chancery as a maths alphabet"
DESCRIPTION = "The package allows (the URW clone of) Zapf Chancery to function \
as a maths alphabet, the target of \\mathcal or \\mathscr, with \
accents appearing where they should, and other spacing \
parameters set to reasonable (not very tight) values. The font \
itself may be found in the URW basic fonts collection. This \
package supersedes the pzccal package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn21701"

RPM_NAME = "texlive-urwchancal-2023.201.1svn21701-53.1.noarch.rpm"
RPM_HASH = "ef1ff97d0fed33ed91b9f5d125124654c3640935f7de4825599eb1624236099f6389c4b7362baf8aac6872a2525f078060bdf8a6d6af0d05c620914733281002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(urwchancal.sty) tex(urwchancal.tfm) tex(urwchancal.vf) tex(uurwchancal.fd) texlive-urwchancal"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
