SUMMARY = "Conky Configuration File Support for nano"
DESCRIPTION = "Conky is an configurable system monitor for X. \
 \
This package provides syntax highlighting support for conky \
configuration files in nano."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "nano-plugin-conky-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "0110ad9d166b9f0a779fcfca2c6595193daf7bc23293801d740e4055276ccbe275aab2fe0b886f19d87572bed43e7c2da89df2176eb4bf00a150d13e10039dd2"

RPROVIDES:${PN} += "conky-nano nano-plugin-conky nano-plugin-conky(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
