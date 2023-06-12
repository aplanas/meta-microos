SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-nl-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "1f2dc8aaf79153e8afe4f33b1a694a2c1ba86b66d5f7b156475a8fd72514a0bbab1673a7be49484613f510e227e514b91903613f7bd094b63ddfa4c74f15b36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nl) yast2-trans-nl"
RDEPENDS:${PN} += ""

inherit rpm
