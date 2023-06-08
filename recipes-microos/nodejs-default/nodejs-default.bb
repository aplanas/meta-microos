SUMMARY = "Default version of nodejs"
DESCRIPTION = "Depends on the most current and recommended version of nodejs for \
the current architecture and codestream."
LICENSE = "MIT"

PV = "5.1"

RPM_NAME = "nodejs-default-5.1-1.2.aarch64.rpm"
RPM_HASH = "8ce7aef8c50cdc0a7489d9634c8770aa9c6e92c4b02fb9e055df41e4caac6abaa60813641845021ea2920b20aad85211ded40029c22b1a428b4b982a8d422830"

RPROVIDES:${PN} += "nodejs nodejs(engine) nodejs-default nodejs-default(aarch-64)"
RDEPENDS:${PN} += "nodejs-common nodejs19"

inherit rpm
