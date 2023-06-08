SUMMARY = "Default/Preset collection of rime schemas"
DESCRIPTION = "Default/Preset collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-default-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "33bd24cd7805406a08b11e4e3e9ec0480eaf2c14a30170cce2671e47d8da5865f4f7df9de440188d7c4f9892a33088fc51b9bfc00ba015c97666bd7acfeaf6aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-default"
RDEPENDS:${PN} += "rime-schema-bopomofo rime-schema-cangjie rime-schema-essay rime-schema-luna-pinyin rime-schema-prelude rime-schema-stroke rime-schema-terra-pinyin"

inherit rpm
