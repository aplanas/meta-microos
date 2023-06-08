SUMMARY = "Graphics and font utilities"
DESCRIPTION = "Programs for conversion between font formats, testing fonts, \
virtual fonts, .gf and .pk manipulation, mft, fontinst, etc. \
Manipulating OpenType, TrueType, Type 1,and for manipulation of \
PostScript and other image formats."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61207"

RPM_NAME = "texlive-collection-fontutils-2023.201.svn61207-56.1.noarch.rpm"
RPM_HASH = "84e6cdc5528d1fe6322362482c4bee68d0f765d63373f04680adb2bfb997940e43dfbcb5fbdc6f6c28f022d4ab72ca52faeb4cb7b5c0ebf2472d9832be30d763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-fontutils"
RDEPENDS:${PN} += "psutils texlive-accfonts texlive-afm2pl texlive-albatross texlive-collection-basic texlive-dosepsbin texlive-dvipsconfig texlive-epstopdf texlive-fontinst texlive-fontools texlive-fontware texlive-lcdftypetools texlive-luafindfont texlive-metatype1 texlive-mf2pt1 texlive-ps2eps texlive-ps2pk texlive-ttfutils"

inherit rpm
