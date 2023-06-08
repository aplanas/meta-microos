SUMMARY = "Greek"
DESCRIPTION = "Support for Greek."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65038"

RPM_NAME = "texlive-collection-langgreek-2023.201.svn65038-56.1.noarch.rpm"
RPM_HASH = "d2a7ba406ee0d1c996ef1f696ba81d6da4aad7bb65d6949b9adc97eca82f2bb5f6b97b0147693b8e1d75aa27718b409822dd4723914dffba8b27e25070f56166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langgreek"
RDEPENDS:${PN} += "texlive-babel-greek texlive-begingreek texlive-betababel texlive-cbfonts texlive-cbfonts-fd texlive-collection-basic texlive-gfsbaskerville texlive-gfsporson texlive-greek-fontenc texlive-greek-inputenc texlive-greekdates texlive-greektex texlive-greektonoi texlive-hyphen-ancientgreek texlive-hyphen-greek texlive-ibycus-babel texlive-ibygrk texlive-kerkis texlive-levy texlive-lgreek texlive-lgrmath texlive-mkgrkindex texlive-talos texlive-teubner texlive-xgreek texlive-yannisgr"

inherit rpm
