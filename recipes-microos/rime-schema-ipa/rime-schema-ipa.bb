SUMMARY = "ipa input schema for rime"
DESCRIPTION = "ipa input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-ipa-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "91ecd823b3b7f11bf795e4eda434109ac98367caa040e7429609e5b49338df1b0a1cf9be72c7373409ed48fee10a96a5e3b99a73d1a82f65394506f7e498751a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-ipa"
RDEPENDS:${PN} += ""

inherit rpm
