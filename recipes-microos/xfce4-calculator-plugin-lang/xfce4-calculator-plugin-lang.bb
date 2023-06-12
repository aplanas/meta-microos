SUMMARY = "Translations for package xfce4-calculator-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-calculator-plugin' package."
LICENSE = "GPL-2.0-only"

PV = "0.7.2"

RPM_NAME = "xfce4-calculator-plugin-lang-0.7.2-1.1.noarch.rpm"
RPM_HASH = "44cff5ac50b817ffae375bd878c527f2dc4f6d3db4555b1894dca7cfedeee5ba0e9e4fedfdcaf6eb1372bbc08b75fca5d61816d9ca98a98cbdfceaa3734248bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-calculator-plugin:be) \
locale(xfce4-calculator-plugin:bg) \
locale(xfce4-calculator-plugin:ca) \
locale(xfce4-calculator-plugin:cs) \
locale(xfce4-calculator-plugin:da) \
locale(xfce4-calculator-plugin:de) \
locale(xfce4-calculator-plugin:en_AU) \
locale(xfce4-calculator-plugin:en_CA) \
locale(xfce4-calculator-plugin:en_GB) \
locale(xfce4-calculator-plugin:es) \
locale(xfce4-calculator-plugin:et) \
locale(xfce4-calculator-plugin:eu) \
locale(xfce4-calculator-plugin:fi) \
locale(xfce4-calculator-plugin:fr) \
locale(xfce4-calculator-plugin:gl) \
locale(xfce4-calculator-plugin:he) \
locale(xfce4-calculator-plugin:hi) \
locale(xfce4-calculator-plugin:hr) \
locale(xfce4-calculator-plugin:hu) \
locale(xfce4-calculator-plugin:id) \
locale(xfce4-calculator-plugin:is) \
locale(xfce4-calculator-plugin:it) \
locale(xfce4-calculator-plugin:ja) \
locale(xfce4-calculator-plugin:ko) \
locale(xfce4-calculator-plugin:lt) \
locale(xfce4-calculator-plugin:ms) \
locale(xfce4-calculator-plugin:nb) \
locale(xfce4-calculator-plugin:nl) \
locale(xfce4-calculator-plugin:pl) \
locale(xfce4-calculator-plugin:pt) \
locale(xfce4-calculator-plugin:pt_BR) \
locale(xfce4-calculator-plugin:ru) \
locale(xfce4-calculator-plugin:sk) \
locale(xfce4-calculator-plugin:sl) \
locale(xfce4-calculator-plugin:sq) \
locale(xfce4-calculator-plugin:sr) \
locale(xfce4-calculator-plugin:sv) \
locale(xfce4-calculator-plugin:tr) \
locale(xfce4-calculator-plugin:uk) \
locale(xfce4-calculator-plugin:zh_CN) \
locale(xfce4-calculator-plugin:zh_TW) \
xfce4-calculator-plugin-lang \
xfce4-calculator-plugin-lang-all \
xfce4-panel-plugin-calculator-lang"
RDEPENDS:${PN} += "xfce4-calculator-plugin"

inherit rpm
