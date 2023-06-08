SUMMARY = "double-pinyin input schema for rime"
DESCRIPTION = "double-pinyininput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-double-pinyin-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "8199ac2fb8b8041853b553167be9c784049b34f814588af392305db0d8dca344d18f3b942b7d9635b82962a491e97bfcb0912a2049d14e4424cf0494dcca78b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-double-pinyin"
RDEPENDS:${PN} += ""

inherit rpm
