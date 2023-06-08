SUMMARY = "IRC for SeaMonkey"
DESCRIPTION = "An IRC client (Chatzilla) for SeaMonkey."
LICENSE = "MPL-2.0"

PV = "2.53.16"

RPM_NAME = "seamonkey-irc-2.53.16-1.1.aarch64.rpm"
RPM_HASH = "1ba4afd8ff75a17da14a1f1376d44e45bd835fa06ab679e29454c19a08444e96b5270b435ab29598c78bcd76430944e4450c1f3ae6b17081aae93b35afbbec29"

RPROVIDES:${PN} += "seamonkey-irc seamonkey-irc(aarch-64)"
RDEPENDS:${PN} += "seamonkey"

inherit rpm
