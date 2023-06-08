SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-ja-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "690ed5a156be36666ec245ce690de594a11803ae8f8043ff9e01d2e80517a428f9dd7f9d9c46ef63c8e410884d8895c8448aa0030004dd22466e0df925fe40cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ja) yast2-trans-ja"
RDEPENDS:${PN} += ""

inherit rpm
