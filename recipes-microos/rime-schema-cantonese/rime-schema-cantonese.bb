SUMMARY = "cantonese input schema for rime"
DESCRIPTION = "cantonese(jyutping) input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-cantonese-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "04d0fa88a5ca79fffd4f4e6914e1b83efbfb635532eddc16684a472224ccabd15d2187290c86b5be9f05aad1aa04a90b0d055afaa1b00f93a026c4ac888c6b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cantonese rime-schema-jyutping"
RDEPENDS:${PN} += ""

inherit rpm
