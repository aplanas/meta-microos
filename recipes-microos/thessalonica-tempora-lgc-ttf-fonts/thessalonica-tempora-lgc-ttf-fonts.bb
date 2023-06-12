SUMMARY = "Tempora LGC Unicode Fonts (TrueType Format)"
DESCRIPTION = "Tempora LGC Unicode is a font family, designed to provide a free \
typeface suitable for word processing in languages which use 3 European \
alphabets: Latin, Greek and Cyrillic. It may be especially useful for \
philologists (mainly slavists and classicists), since it supports \
historical Cyrillic letters available in the Unicode standard (including \
letters used in Russian  pre-1918 orthography) as well as all accented \
combinations and additional characters needed for fully accented Greek \
(both classical and modern). Tempora LGC Unicode is a 'smart' font, \
intended to demonstrate nicities of the OpenType technologie, applicable \
to European scripts. \
 \
This package contains fonts in TrueType format."
LICENSE = "GPL-2.0-with-font-exception"

PV = "0.2.1"

RPM_NAME = "thessalonica-tempora-lgc-ttf-fonts-0.2.1-11.18.noarch.rpm"
RPM_HASH = "ae0a3b55f794aa21f76778be32353d39f05f4ed319796a1026cd345e81cd2000e1cb56400e4e5361c370afa4ae30f35e4c07ad5ea4f4230fefa9adec603ae99a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tempora-lgc-fonts-ttf \
thessalonica-tempora-lgc-ttf-fonts"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
