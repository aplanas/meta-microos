SUMMARY = "Smart Unicode Font for the Ethiopic Script (Amharic)"
DESCRIPTION = "The Ethiopic script is used for writing many of the languages of \
Ethiopia and Eritrea.  Ethiopic (U+1200..U+137F) was added to Unicode \
3.0.  Ethiopic Supplement (U+1380..U+139F) and Ethiopic Extended \
(U+2D80..U+2DDF) were added to Unicode 4.1. Abyssinica SIL supports all \
Ethiopic characters which are in Unicode including the Unicode 4.1 \
extensions. Some languages of Ethiopia are not yet able to be fully \
represented in Unicode and, where necessary, we have included \
non-Unicode characters in the Private Use Area (see Private-use (PUA) \
characters supported by Abyssinica SIL). \
 \
Abyssinica SIL is based on Ethiopic calligraphic traditions. This \
release is a regular typeface, with no bold or italic version available \
or planned."
LICENSE = "OFL-1.1"

PV = "2.200"

RPM_NAME = "sil-abyssinica-fonts-2.200-1.2.noarch.rpm"
RPM_HASH = "9f01f2cc95bc454c21b057b267d671cd33b85c11790f31743df80850eb58f86e1b524582fccc863f7f4fab4dfc65a22e61255459ff86e5127cb0ee6499bbf889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(so) sil-abyssinica sil-abyssinica-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
