SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.38.1"

RPM_NAME = "util-linux-tty-tools-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "600c4e56268396091e85cd2b4ca7cd73f57072dc3df084d9170ee4c96c5580f07e1d03365db1684aff6fcb8206ab22c9f3007b6dcc4fa59b41a805f61c214d3f"

RPROVIDES:${PN} += "util-linux-tty-tools util-linux-tty-tools(aarch-64) util-linux:/usr/bin/mesg util-linux:/usr/bin/wall util-linux:/usr/bin/write"
RDEPENDS:${PN} += "/bin/sh group(tty) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) permissions"

inherit rpm
