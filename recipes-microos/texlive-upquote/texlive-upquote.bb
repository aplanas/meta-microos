SUMMARY = "Show 'realistic' quotes in verbatim"
DESCRIPTION = "Typewriter-style fonts are best for program listings, but \
Computer Modern Typewriter prints ` and ' as bent opening and \
closing single quotes. Other fonts, and most programming \
languages, print ` as a grave accent and ' upright; ' is used \
both to open and to close quoted strings. The package switches \
the typewriter font to Computer Modern Typewriter in OT1 \
encoding, and modifies the behaviour of verbatim, verbatim*, \
\\verb, and \\verb* to print in the '` and ' way'. It does \
thisregardless of other fonts or encodings in use, so long as \
the package is loaded after the other fonts were. The package \
does not affect \\tt, \\texttt, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn26059"

RPM_NAME = "texlive-upquote-2023.201.1.3svn26059-53.1.noarch.rpm"
RPM_HASH = "65d317458b637b6d4078a6c6c40324f50ebedfacd3317d15a63fc4bb08eeb0534ef3bd8b137f4d63e20b5046021059ab6d7ecca0e87c2482ccc99b0a13074d82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(upquote.sty) \
texlive-upquote"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(textcomp.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
