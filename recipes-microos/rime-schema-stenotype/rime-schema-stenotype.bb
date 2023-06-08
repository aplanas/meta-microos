SUMMARY = "stenotype input schema for rime"
DESCRIPTION = "stenotypeinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-stenotype-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "60c878e7ab1f6ed9cfda0f50be0b0cfde900c1d1902007a11e116db45609acb2bd0f333d9110cbab5259261af12025b53ce5c5913ae86c07e08d5577f0241a71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-stenotype"
RDEPENDS:${PN} += ""

inherit rpm
