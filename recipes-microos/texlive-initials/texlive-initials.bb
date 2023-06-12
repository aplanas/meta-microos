SUMMARY = "Adobe Type 1 decorative initial fonts"
DESCRIPTION = "For each font, at least a .pfb and a .tfm file is provided, \
with an .fd file for use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54080"

RPM_NAME = "texlive-initials-2023.201.svn54080-52.1.noarch.rpm"
RPM_HASH = "fb3334e26c0631bd5f8c7f808ba25c80ea40b99c8c91a1ab766574ef12c05c1c210ad5e460ce66a1f4749671029742a11dc54ad47dc20cf7e7f9eeb8b2a1268c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Acorn.fd) \
tex(Acorn.map) \
tex(Acorn.tfm) \
tex(AnnSton.fd) \
tex(AnnSton.map) \
tex(AnnSton.tfm) \
tex(ArtNouv.fd) \
tex(ArtNouv.map) \
tex(ArtNouv.tfm) \
tex(ArtNouvc.fd) \
tex(ArtNouvc.map) \
tex(ArtNouvc.tfm) \
tex(Carrickc.fd) \
tex(Carrickc.map) \
tex(Carrickc.tfm) \
tex(Eichenla.fd) \
tex(Eichenla.map) \
tex(Eichenla.tfm) \
tex(Eileen.fd) \
tex(Eileen.map) \
tex(Eileen.tfm) \
tex(EileenBl.fd) \
tex(EileenBl.map) \
tex(EileenBl.tfm) \
tex(Elzevier.fd) \
tex(Elzevier.map) \
tex(Elzevier.tfm) \
tex(GotIn.fd) \
tex(GotIn.map) \
tex(GotIn.tfm) \
tex(GoudyIn.fd) \
tex(GoudyIn.map) \
tex(GoudyIn.tfm) \
tex(Kinigcap.fd) \
tex(Kinigcap.map) \
tex(Kinigcap.tfm) \
tex(Konanur.fd) \
tex(Konanur.map) \
tex(Konanur.tfm) \
tex(Kramer.fd) \
tex(Kramer.map) \
tex(Kramer.tfm) \
tex(MorrisIn.fd) \
tex(MorrisIn.map) \
tex(MorrisIn.tfm) \
tex(Nouveaud.fd) \
tex(Nouveaud.map) \
tex(Nouveaud.tfm) \
tex(Romantik.fd) \
tex(Romantik.map) \
tex(Romantik.tfm) \
tex(Rothdn.fd) \
tex(Rothdn.map) \
tex(Rothdn.tfm) \
tex(RoyalIn.fd) \
tex(RoyalIn.map) \
tex(RoyalIn.tfm) \
tex(Sanremo.fd) \
tex(Sanremo.map) \
tex(Sanremo.tfm) \
tex(Starburst.fd) \
tex(Starburst.map) \
tex(Starburst.tfm) \
tex(Typocaps.fd) \
tex(Typocaps.map) \
tex(Typocaps.tfm) \
tex(Zallman.fd) \
tex(Zallman.map) \
tex(Zallman.tfm) \
texlive-initials"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-initials-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
