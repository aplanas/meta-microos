SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-cs-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "2966a42be0b6163ee8fbc7e40b6db742584395133d914ab860cd336873b645979af9883afad62a8e7e72860690a1ffb0867c0368506c7400150c2bee7da7f0ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:cs) yast2-trans-cs"
RDEPENDS:${PN} += ""

inherit rpm
