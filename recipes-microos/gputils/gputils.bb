SUMMARY = "Development utilities for Microchip PIC microcontrollers"
DESCRIPTION = "This is a collection of development tools for Microchip PIC \
microcontrollers. \
 \
Gputils implements a subset of features available with Microchip's tools. \
See the documentation for an up-to-date list of what gputils can do."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.2"

RPM_NAME = "gputils-1.5.2-1.4.aarch64.rpm"
RPM_HASH = "2bf74cda43109c9b5b52bd386d91df6311f6a830be527646cdf798e9191d9cc129910d9ce5ad3659d8b62ce7897af1892534ca30fa9cf46faa5dcfcae726fddc"

RPROVIDES:${PN} += "gputils gputils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
