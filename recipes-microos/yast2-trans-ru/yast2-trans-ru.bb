SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ru-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "670483a9268cfc4b50b0267a34018d919215f50bd0d711b0194f2f58898cf26047fa9bc1aee1a0a8007f74ca7942320c78a902d89a8d2454599d6b0fe70e7e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ru) yast2-trans-ru"
RDEPENDS:${PN} += ""

inherit rpm
