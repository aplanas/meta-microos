SUMMARY = "bopomofo input schema for rime"
DESCRIPTION = "bopomofoinput schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20210525+git.4f7fc2a"

RPM_NAME = "rime-schema-bopomofo-20210525+git.4f7fc2a-1.9.noarch.rpm"
RPM_HASH = "a8dd05955af139a516b8d06dc9f8229251f3e6923a5b901b88654ef8f1601a0d0398752e8ed1e8122494e701ae9061f4270b0e7ee103351ef1e25731cffb3a5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-bopomofo"
RDEPENDS:${PN} += ""

inherit rpm
