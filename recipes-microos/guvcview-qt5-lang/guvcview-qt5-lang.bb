SUMMARY = "Translations for package guvcview-qt5"
DESCRIPTION = "Provides translations for the 'guvcview-qt5' package."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "guvcview-qt5-lang-2.0.8-1.4.noarch.rpm"
RPM_HASH = "de70b42d201a8da6f49e7d246e395524c22847c06d069cbc2ebbde80dfeee375274b721a5372605aaec9d9ee1bd3ed91cf4404615aa0cd62d6c5bf3d4ee0acd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "guvcview-qt5-lang guvcview-qt5-lang-all locale(guvcview-qt5:bg) locale(guvcview-qt5:bs) locale(guvcview-qt5:cs) locale(guvcview-qt5:da) locale(guvcview-qt5:de) locale(guvcview-qt5:en_AU) locale(guvcview-qt5:es) locale(guvcview-qt5:eu) locale(guvcview-qt5:fr) locale(guvcview-qt5:gl) locale(guvcview-qt5:he) locale(guvcview-qt5:hr) locale(guvcview-qt5:it) locale(guvcview-qt5:ja) locale(guvcview-qt5:lv) locale(guvcview-qt5:nl) locale(guvcview-qt5:pl) locale(guvcview-qt5:pt) locale(guvcview-qt5:pt_BR) locale(guvcview-qt5:ru) locale(guvcview-qt5:si) locale(guvcview-qt5:sr) locale(guvcview-qt5:tr) locale(guvcview-qt5:uk) locale(guvcview-qt5:zh_TW)"
RDEPENDS:${PN} += "guvcview-qt5"

inherit rpm
