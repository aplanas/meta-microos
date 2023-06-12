SUMMARY = "Translations for package pspp"
DESCRIPTION = "Provides translations for the 'pspp' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pspp-lang-1.4.1-3.12.noarch.rpm"
RPM_HASH = "43261856af32d436e9f29b4e6aa89c8a2426caff38e1c1348af0bd8bed67b49595159834ab08655a6a849651f6cea69deb089d2e5b77e6aadf3792dab92e288d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(pspp:ca) \
locale(pspp:cs) \
locale(pspp:de) \
locale(pspp:el) \
locale(pspp:es) \
locale(pspp:fr) \
locale(pspp:gl) \
locale(pspp:hu) \
locale(pspp:ja) \
locale(pspp:lt) \
locale(pspp:nl) \
locale(pspp:pl) \
locale(pspp:pt_BR) \
locale(pspp:ru) \
locale(pspp:sl) \
locale(pspp:tr) \
locale(pspp:uk) \
locale(pspp:zh_CN) \
pspp-lang \
pspp-lang-all"
RDEPENDS:${PN} += "pspp"

inherit rpm
