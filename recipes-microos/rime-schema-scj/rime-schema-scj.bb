SUMMARY = "scj input schema for rime"
DESCRIPTION = "scjinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-scj-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "0aff5ca9d476edaa4510fd29a94b0688e635ae0a4735c5eae97f1e77a2b9fdcd99daebaa255361c3219933e8f1abb1770a680b9ef978758a0d6783286420c2ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-scj"
RDEPENDS:${PN} += ""

inherit rpm
