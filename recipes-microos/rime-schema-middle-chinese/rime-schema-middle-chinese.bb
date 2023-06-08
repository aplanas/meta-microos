SUMMARY = "middle-chinese input schema for rime"
DESCRIPTION = "middle-chineseinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-middle-chinese-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "efec74f4d34f43fb5d13945427bf4ca65cd46caffabc91a1248cac7c3aa4ae10c9b3f6c3cb2d5e75cc8fd66f5850dd6194ffc73e3fb7c4de2a016b7cf6c0dd65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-middle-chinese"
RDEPENDS:${PN} += ""

inherit rpm
