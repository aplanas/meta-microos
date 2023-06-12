SUMMARY = "luna-pinyin input schema for rime"
DESCRIPTION = "luna-pinyin input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-luna-pinyin-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "c997f9906e3c21ed11bd3d3e1af1e13dcbf95a2694397faf665c924629b281250e396db0b336de15925c3247479111bbbad7d6022ef204da723e385d4485aff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-luna-pinyin"
RDEPENDS:${PN} += ""

inherit rpm
