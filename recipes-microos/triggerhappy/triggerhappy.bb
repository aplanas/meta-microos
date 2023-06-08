SUMMARY = "Lightweight hotkey daemon"
DESCRIPTION = "Triggerhappy \
- a lightweight hotkey daemon - \
 \
by Stefan Tomanek <stefan.tomanek+th@wertarbyte.de> \
http://github.com/wertarbyte/triggerhappy/ \
 \
Triggerhappy is a hotkey daemon developed with small and embedded systems in \
mind, e.g. linux based routers. It attaches to the input device files and \
interprets the event data received and executes scripts configured in its \
configuration."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "triggerhappy-0.5.0-3.3.aarch64.rpm"
RPM_HASH = "202991e2dd82b378a203944b4568754048d488a39ff1bda17ad0ff9cb813a12b39818c08076dc0f510a24c1854626f2dec6e5cc5af0efb1dd84ac19124b94387"

RPROVIDES:${PN} += "triggerhappy triggerhappy(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
