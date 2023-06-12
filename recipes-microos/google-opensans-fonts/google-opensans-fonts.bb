SUMMARY = "Humanist Sans Serif Typeface"
DESCRIPTION = "Open Sans is a humanist sans serif typeface designed by \
Steve Matteson, Type Director of Ascender Corp. \
 \
This version contains the complete 897 character set, which \
includes the standard ISO Latin 1, Latin CE, Greek and Cyrillic \
character sets. Open Sans was designed with an upright stress, \
open forms and a neutral, yet friendly appearance. It was \
optimized for print, web, and mobile interfaces, and has \
excellent legibility characteristics in its letterforms. \
 \
Designer: Steve Matteson"
LICENSE = "OFL-1.1"

PV = "20210927"

RPM_NAME = "google-opensans-fonts-20210927-1.2.noarch.rpm"
RPM_HASH = "1343b87fb18f48c3ff6ccfa4aa5038fa61d93598b3f21365acc45081e9652fa2171f6c8a680e69c85b98b284628249f80557931b71d8155ead0a856f85298b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-opensans-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
