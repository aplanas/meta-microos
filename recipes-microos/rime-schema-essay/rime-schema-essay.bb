SUMMARY = "essay input schema for rime"
DESCRIPTION = "essayinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-essay-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "f88833cd75bb035568b14cf0c6d82f54d611dc1674c701c1f8522c21c798efaec318e30dcd6a5d37eb2c3e994c85da4604756ba2b9a1a3bd7fada64e7b25ae2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-essay"
RDEPENDS:${PN} += ""

inherit rpm
