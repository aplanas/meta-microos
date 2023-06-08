SUMMARY = "combo-pinyin input schema for rime"
DESCRIPTION = "combo-pinyininput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-combo-pinyin-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "a63c173112fa6ca88bbb031474b2bc7662627d6162e34556bf623654c27ee9879caf8152bed0b8733daba43459bb89d74f48f3e73a5721feea2fa426653bddcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-combo-pinyin"
RDEPENDS:${PN} += ""

inherit rpm
