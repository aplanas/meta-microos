SUMMARY = "A font for the Cherokee script"
DESCRIPTION = "The Cherokee script was designed in 1821 by Segwoya. The \
alphabet is essentially syllabic, only 6 characters (a e i o s \
u) correspond to Roman letters: the font encodes these to the \
corresponding roman letter. The remaining 79 characters have \
been arbitrarily encoded in the range 38-122; the cherokee \
package provides commands that map each such syllable to the \
appropriate character; for example, Segwoya himself would be \
represented \\Cse\\Cgwo\\Cya. The font is distributed as Metafont \
source; it works very poorly in modern environments, and could \
do with expert attention (if you are interested, please contact \
the CTAN team for details)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21046"

RPM_NAME = "texlive-cherokee-2023.201.svn21046-53.1.noarch.rpm"
RPM_HASH = "d0d765e06b8ca8faccca7b5bd2fd206e8d31781fcf99aa4328548f1266fe5274727be5171a880e619436d20fe1aa530d9aee531cac9ae4d14104045ea29cab6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cherokee.sty) tex(cherokee.tfm) texlive-cherokee"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
