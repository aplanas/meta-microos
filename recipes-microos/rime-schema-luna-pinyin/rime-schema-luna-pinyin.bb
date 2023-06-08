SUMMARY = "luna-pinyin input schema for rime"
DESCRIPTION = "luna-pinyininput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-luna-pinyin-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "7be7ed44d4bea48ae17c26e48f05f358bf8cdfb3df2084e8cc17de6d3574fd202266894ecdee8ebed304be38ed053b6a5a6c5f9e724f8c05631572564b5aa11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-luna-pinyin"
RDEPENDS:${PN} += ""

inherit rpm
