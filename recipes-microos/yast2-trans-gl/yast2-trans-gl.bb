SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-gl-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "b4d4f95013929464eef7910c88b77983d3ee940eb8e614e89f5d33133c97f44796a3e846ef2df9aac192a76188016e8bfdbcfb865c654e537981296e9fab64b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:gl) yast2-trans-gl"
RDEPENDS:${PN} += ""

inherit rpm
