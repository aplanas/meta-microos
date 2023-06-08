SUMMARY = "Translations for package gnome-usage"
DESCRIPTION = "Provides translations for the 'gnome-usage' package."
LICENSE = "GPL-3.0-only"

PV = "3.38.1"

RPM_NAME = "gnome-usage-lang-3.38.1-1.10.noarch.rpm"
RPM_HASH = "a04d2d44b5d63546ef5e04c9e5d6a160a9cd57897f919594e8ef146b2b2d9f89c22e0d5a027e45a0ca3d3a5eb2d8729ccd12342a2dc50cd0ca2edf6ed2dc3089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-usage-lang gnome-usage-lang-all locale(gnome-usage:ca) locale(gnome-usage:cs) locale(gnome-usage:da) locale(gnome-usage:de) locale(gnome-usage:el) locale(gnome-usage:en_GB) locale(gnome-usage:es) locale(gnome-usage:eu) locale(gnome-usage:fi) locale(gnome-usage:fr) locale(gnome-usage:fur) locale(gnome-usage:gl) locale(gnome-usage:he) locale(gnome-usage:hr) locale(gnome-usage:hu) locale(gnome-usage:id) locale(gnome-usage:it) locale(gnome-usage:ja) locale(gnome-usage:nb) locale(gnome-usage:nl) locale(gnome-usage:pl) locale(gnome-usage:pt) locale(gnome-usage:pt_BR) locale(gnome-usage:ro) locale(gnome-usage:ru) locale(gnome-usage:sk) locale(gnome-usage:sl) locale(gnome-usage:sr) locale(gnome-usage:sr@latin) locale(gnome-usage:sv) locale(gnome-usage:tr) locale(gnome-usage:uk) locale(gnome-usage:zh_CN) locale(gnome-usage:zh_TW)"
RDEPENDS:${PN} += "gnome-usage"

inherit rpm
