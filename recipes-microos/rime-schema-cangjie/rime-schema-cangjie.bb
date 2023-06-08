SUMMARY = "cangjie input schema for rime"
DESCRIPTION = "cangjieinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-cangjie-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "74beeb2bebb7014057b018c3d81c7d2fde361aaab695837d35f79dc915b2985be24fc61e2284c9a8ab663093ad8c8a8fd560a97dc57c28b2aa14c30ab1b7d410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cangjie"
RDEPENDS:${PN} += ""

inherit rpm
