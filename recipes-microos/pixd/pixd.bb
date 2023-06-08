SUMMARY = "Colourful visualization tool for binary files"
DESCRIPTION = "pixd is a tool for visualizing binary data using a colour palette. \
It is in a lot of ways akin to a hexdump tool, except using coloured \
squares to represent each octet."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "pixd-1.0.0-1.19.aarch64.rpm"
RPM_HASH = "c5e76063a36989bd9eaef558608403b1be8b06d848d781c00bbe37e3d4e97ec9e972a851d5758922de25522a4eee8a4c5a668ea45209c92825ddefad07d98615"

RPROVIDES:${PN} += "pixd pixd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
