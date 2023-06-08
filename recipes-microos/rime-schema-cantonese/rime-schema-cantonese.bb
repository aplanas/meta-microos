SUMMARY = "cantonese input schema for rime"
DESCRIPTION = "cantoneseinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-cantonese-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "15980d77e92794998f89380d7986093f852688e31a9e448bcb3c1b6f7946cf3bcd684397425070e59ad672b9c9d14d434d5b1d9d55e53c32526e8a15ffe814fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-cantonese"
RDEPENDS:${PN} += ""

inherit rpm
