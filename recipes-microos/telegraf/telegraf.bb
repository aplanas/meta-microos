SUMMARY = "The plugin-driven server agent for collecting & reporting metrics"
DESCRIPTION = "Telegraf is an agent written in Go for collecting, processing, aggregating, and writing metrics. \
 \
Design goals are to have a minimal memory footprint with a plugin system so that developers in the community can \
easily add support for collecting metrics from local or remote services."
LICENSE = "MIT"

PV = "1.26.2"

RPM_NAME = "telegraf-1.26.2-1.1.aarch64.rpm"
RPM_HASH = "3081c45484533a370e5e8afe1527a83e3eadaf0bacd0354e5bb7f23e56e3ca2f417a94b75acad761064b65434d41a5c78ebd3cc0e7ca25b1f934c2f00e6e9922"

RPROVIDES:${PN} += "config(telegraf) telegraf telegraf(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
