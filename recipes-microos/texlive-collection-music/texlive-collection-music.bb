SUMMARY = "Music packages"
DESCRIPTION = "Music-related fonts and packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65862"

RPM_NAME = "texlive-collection-music-2023.201.svn65862-56.1.noarch.rpm"
RPM_HASH = "ea302df7cce59a1e1a261fb6bd3490881c47a8108821e0a7a1afc11db02801ae708cec675fcabd8d520d6f19f5d9d94670cb9632506d266e06055bed23003fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(music) texlive-collection-music"
RDEPENDS:${PN} += "texlive-abc texlive-autosp texlive-bagpipe texlive-chordbars texlive-chordbox texlive-collection-latex texlive-ddphonism texlive-figbas texlive-gchords texlive-gregoriotex texlive-gtrcrd texlive-guitar texlive-guitarchordschemes texlive-guitartabs texlive-harmony texlive-latex4musicians texlive-leadsheets texlive-lilyglyphs texlive-lyluatex texlive-m-tx texlive-musical texlive-musicography texlive-musixguit texlive-musixtex texlive-musixtex-fonts texlive-musixtnt texlive-octave texlive-piano texlive-pmx texlive-pmxchords texlive-recorder-fingering texlive-songbook texlive-songproj texlive-songs texlive-xml2pmx texlive-xpiano"

inherit rpm
