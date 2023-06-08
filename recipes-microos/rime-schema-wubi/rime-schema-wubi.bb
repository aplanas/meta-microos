SUMMARY = "wubi input schema for rime"
DESCRIPTION = "wubiinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-wubi-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "cab1325c3ab526cccf90fef8216573ca2f8811400614f3e4cd5dba779c531b3a5c4da0f891d99bbf9c6a520c767a2d46a9b3cc39598414e858d31df3de6f1689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wubi"
RDEPENDS:${PN} += ""

inherit rpm
