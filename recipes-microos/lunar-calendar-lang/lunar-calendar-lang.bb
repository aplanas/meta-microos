SUMMARY = "Translations for package lunar-calendar"
DESCRIPTION = "Provides translations for the 'lunar-calendar' package."
LICENSE = "GPL-2.0+"

PV = "3.0.0+git20191124.f91a880"

RPM_NAME = "lunar-calendar-lang-3.0.0+git20191124.f91a880-1.15.noarch.rpm"
RPM_HASH = "9994ecd967ae71685253171db76690b88a80f3f0093db0645c938f37721b81bc62ec27c5b9626ee31ccf5f79742a465cfcd2798d42c87cb74ebe06a3d129d8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lunar-calendar:zh_CN) locale(lunar-calendar:zh_HK) locale(lunar-calendar:zh_TW) lunar-calendar-lang lunar-calendar-lang-all"
RDEPENDS:${PN} += "lunar-calendar"

inherit rpm
