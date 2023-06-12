SUMMARY = "Translations for package xfce4-kbdleds-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-kbdleds-plugin' package."
LICENSE = "GPL-2.0-only"

PV = "0.2.5"

RPM_NAME = "xfce4-kbdleds-plugin-lang-0.2.5-1.7.noarch.rpm"
RPM_HASH = "ed3165f326d99454691b35279e5c282fe7966ff380fd7c30fcaf88e4f09136776c1535c321ea13e3419ffda5a39b36cff4872780dfc549264348172521936e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-kbdleds-plugin:ru) \
locale(xfce4-kbdleds-plugin:uk) \
xfce4-kbdleds-plugin-lang \
xfce4-kbdleds-plugin-lang-all"
RDEPENDS:${PN} += "xfce4-kbdleds-plugin"

inherit rpm
