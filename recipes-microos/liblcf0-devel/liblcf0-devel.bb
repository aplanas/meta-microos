SUMMARY = "RPG Maker 2000/2003 and EasyRPG game data library - development files"
DESCRIPTION = "liblcf is a library to handle RPG Maker 2000/2003 and EasyRPG game data. \
It can read and write LCF and XML files."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "liblcf0-devel-0.6.2-2.11.aarch64.rpm"
RPM_HASH = "6aff954008f8ec340d67d8cb24c5072465aa7c5029cb4389c8ffa2bcfbedc7a275cce76e2d0a1ba143c6e94fbe5e79242216bf67ad27d8f681d52928cc828569"

RPROVIDES:${PN} += "cmake(liblcf) liblcf0-devel liblcf0-devel(aarch-64) pkgconfig(liblcf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liblcf0 pkgconfig(expat) pkgconfig(icu-i18n)"

inherit rpm
