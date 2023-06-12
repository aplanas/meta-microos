SUMMARY = "YaST2 - French Translations"
DESCRIPTION = "YaST2 - Translations for French."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-fr-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "8d45bb788e42f4c3e8c53cc3b7f7215ac6bda60d4cc97da765637f9bab367400c21e7ab695cb3386da617f5819dd21a2425352a80c9dfd715786b2fb2affc6ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:fr) \
yast2-trans-fr"
RDEPENDS:${PN} += ""

inherit rpm
