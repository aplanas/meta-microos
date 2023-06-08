SUMMARY = "Typesetting leadsheets and songbooks"
DESCRIPTION = "This LaTeX package offers support for typesetting simple \
leadsheets of songs, i.e. song lyrics and the corresponding \
chords."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn61504"

RPM_NAME = "texlive-leadsheets-2023.201.0.0.7svn61504-54.1.noarch.rpm"
RPM_HASH = "bb22f7dee940f58386a1342ce32c110bbe7569c0373173389b3f63d9e73b497e95c06d113b68d4be38aaefa1eacf4435f6b3eea730bbf73560357f731a1df288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(leadsheet.cls) tex(leadsheets.library.chordnames.code.tex) tex(leadsheets.library.chords.code.tex) tex(leadsheets.library.external.code.tex) tex(leadsheets.library.musejazz.code.tex) tex(leadsheets.library.musicsymbols.code.tex) tex(leadsheets.library.properties.code.tex) tex(leadsheets.library.shorthands.code.tex) tex(leadsheets.library.songs.code.tex) tex(leadsheets.library.templates.code.tex) tex(leadsheets.library.translations.code.tex) tex(leadsheets.library.transposing.code.tex) tex(leadsheets.sty) texlive-leadsheets"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(expl3.sty) tex(l3keys2e.sty) tex(scrlayer-scrpage.sty) tex(translations.sty) tex(xparse.sty) tex(zref-totpages.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
