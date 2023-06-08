SUMMARY = "array input schema for rime"
DESCRIPTION = "arrayinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-array-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "ea6619bca3c19bc7d44449fd28597b4c2e659d5d37d139287f95cabf6f84b953a6480e43e669cd37e12ec2fac911236ea5d1101d14d4ecb2ca9cef5098b131e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-array"
RDEPENDS:${PN} += ""

inherit rpm
