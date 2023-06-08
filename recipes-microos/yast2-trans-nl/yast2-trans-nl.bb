SUMMARY = "YaST2 - Dutch Translations"
DESCRIPTION = "YaST2 - Translations for Dutch."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-nl-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "e0f87d9b5c9ae03d08c084df1469f0956ef0adc6e83ccec303f0fad34d84274cbbfa7f2cecc971ef231ab1f9518b1e9ebeb5da72e510ca8fb7def9cc5e1d2576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:nl) yast2-trans-nl"
RDEPENDS:${PN} += ""

inherit rpm
