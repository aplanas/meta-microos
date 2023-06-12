SUMMARY = "Extra collection of rime schemas"
DESCRIPTION = "Extra collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-extra-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "8093a96ab4ea43a2e4d58c039e9b470ed559d7aee908c0219bd0ad097173ed747eb8e7daac3cfbc27a54e99751cf074d62b9c4ab3d9db174b418da8957bf4e9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-extra"
RDEPENDS:${PN} += "rime-schema-array \
rime-schema-cantonese \
rime-schema-combo-pinyin \
rime-schema-double-pinyin \
rime-schema-emoji \
rime-schema-essay-simp \
rime-schema-ipa \
rime-schema-middle-chinese \
rime-schema-pinyin-simp \
rime-schema-quick \
rime-schema-scj \
rime-schema-soutzoe \
rime-schema-stenotype \
rime-schema-wubi \
rime-schema-wugniu"

inherit rpm
