SUMMARY = "Extra collection of rime schemas"
DESCRIPTION = "Extra collection of rime schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-extra-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "ccebdc9eed8baefc7e36bd725dd2fc026894087b51c788f05ce03e2542c6044c215b30aea1e94fa3a3f27d32e02c8dbeac08571a292a51a403700a242c1e7ae8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-extra"
RDEPENDS:${PN} += "rime-schema-array rime-schema-cantonese rime-schema-combo-pinyin rime-schema-double-pinyin rime-schema-emoji rime-schema-ipa rime-schema-jyutping rime-schema-middle-chinese rime-schema-pinyin-simp rime-schema-quick rime-schema-scj rime-schema-soutzoe rime-schema-stenotype rime-schema-wubi rime-schema-wugniu"

inherit rpm
