SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ku-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "39414614032b0c9d83d7a78895a3632519edb704b3cd86d9237b2c5dba45eb0e015722ab461740d3e5ceeabfcf10bdbcea3a597d47a0a2bf5e8df15744e5a7bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ku) yast2-trans-ku"
RDEPENDS:${PN} += ""

inherit rpm
