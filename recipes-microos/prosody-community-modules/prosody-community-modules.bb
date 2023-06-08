SUMMARY = "Community and experimental modules not distributed as part of Prosody"
DESCRIPTION = "Prosody Community Modules are additional modulse not shipped with the \
main Prosody package. These modules are not tested with the main \
server and may be in alpha or beta state. All modules shipped here may \
require additional configuration by the admin."
LICENSE = "MIT"

PV = "0~hg4900"

RPM_NAME = "prosody-community-modules-0~hg4900-1.5.aarch64.rpm"
RPM_HASH = "28725a5da45cb9e99a35bd028f9bd1478ba48efb81037154a66b7b2a1618b6b576fc825b6473284e289ee8cd7358ada6706b3b795ee58a365bcd9590c1cc2de0"

RPROVIDES:${PN} += "perl(TestConnection) perl(XMPP::TestUtils) prosody-community-modules prosody-community-modules(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh lua51-zlib prosody"

inherit rpm
