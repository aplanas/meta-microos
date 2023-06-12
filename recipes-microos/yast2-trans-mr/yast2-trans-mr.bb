SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-mr-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "acb746fd7b5476a522aaa9a1af6093c5c173f7935b358a8defa65d700068471dc08d59a83ea0cf8e362c24bc01527e729ffd5d2f212c5320c3a97b20a4d77ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:mr) \
yast2-trans-mr"
RDEPENDS:${PN} += ""

inherit rpm
