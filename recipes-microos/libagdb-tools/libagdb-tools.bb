SUMMARY = "Utilities for reading SuperFetch databases"
DESCRIPTION = "This subpackage contains the utility programs from libagdb to \
read SuperFetch databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-tools-20210429-3.5.aarch64.rpm"
RPM_HASH = "fc08393abb222bd715cd56e897a7dfc36e8fc49823eb21b4f67907dcacce9706c1c046d05cd5a02019b410b4b4ae5c6dc5b1c936d080299fbc2b68a3eb3b32b6"

RPROVIDES:${PN} += "libagdb-tools libagdb-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libagdb.so.1()(64bit) libagdb.so.1(V_20210429)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libfdatetime.so.1()(64bit) libfdatetime.so.1(V_20220112)(64bit)"

inherit rpm
