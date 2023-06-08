SUMMARY = "All rime input schemas"
DESCRIPTION = "All rime input schemas."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-all-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "8990a65b6054cceb6f814678455120be5b89eea02c14489d635dd831be243509ada54e79a0dad99cde4e496f5396228d30ef52c39e16acffbc387b6f47afd7a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "brise rime-schema-all"
RDEPENDS:${PN} += "rime-schema-default rime-schema-extra"

inherit rpm
