SUMMARY = "Translations for package kdevelop5-plugin-python3"
DESCRIPTION = "Provides translations to the package kdevelop5-plugin-python3"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdevelop5-plugin-python3-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "43ca05fe49a354ab728cb4063bb1bbe4cccb9c2dac2bc09192ddce3445e762ecaaafc3a73aca888889cca2f65e695a1571cb7d83b07ed932ce57c8f361cb903c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevelop5-plugin-python3-lang kdevelop5-plugin-python3-lang-all locale(kdevelop5-plugin-python3:bs) locale(kdevelop5-plugin-python3:ca) locale(kdevelop5-plugin-python3:ca@valencia) locale(kdevelop5-plugin-python3:cs) locale(kdevelop5-plugin-python3:da) locale(kdevelop5-plugin-python3:de) locale(kdevelop5-plugin-python3:en_GB) locale(kdevelop5-plugin-python3:eo) locale(kdevelop5-plugin-python3:es) locale(kdevelop5-plugin-python3:et) locale(kdevelop5-plugin-python3:eu) locale(kdevelop5-plugin-python3:fi) locale(kdevelop5-plugin-python3:fr) locale(kdevelop5-plugin-python3:ga) locale(kdevelop5-plugin-python3:gl) locale(kdevelop5-plugin-python3:hu) locale(kdevelop5-plugin-python3:it) locale(kdevelop5-plugin-python3:ja) locale(kdevelop5-plugin-python3:ka) locale(kdevelop5-plugin-python3:kk) locale(kdevelop5-plugin-python3:ko) locale(kdevelop5-plugin-python3:lt) locale(kdevelop5-plugin-python3:mai) locale(kdevelop5-plugin-python3:mr) locale(kdevelop5-plugin-python3:nds) locale(kdevelop5-plugin-python3:nl) locale(kdevelop5-plugin-python3:nn) locale(kdevelop5-plugin-python3:pl) locale(kdevelop5-plugin-python3:pt) locale(kdevelop5-plugin-python3:pt_BR) locale(kdevelop5-plugin-python3:ro) locale(kdevelop5-plugin-python3:ru) locale(kdevelop5-plugin-python3:sk) locale(kdevelop5-plugin-python3:sl) locale(kdevelop5-plugin-python3:sv) locale(kdevelop5-plugin-python3:th) locale(kdevelop5-plugin-python3:tr) locale(kdevelop5-plugin-python3:ug) locale(kdevelop5-plugin-python3:uk) locale(kdevelop5-plugin-python3:zh_CN) locale(kdevelop5-plugin-python3:zh_TW)"
RDEPENDS:${PN} += "kdevelop5-plugin-python3"

inherit rpm
