SUMMARY = "Yet Another Python Profiler"
DESCRIPTION = "Yet Another Python Profiler"
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python311-yappi-1.4.0-2.5.aarch64.rpm"
RPM_HASH = "f76abd1f4bd02d267a93ccba2afea4aa22205ee1436e32e6b93dadb33ea431902c45d29c0abd770535f6519af0f808aaf76ff42f072617a706997d6f6454312e"

RPROVIDES:${PN} += "python3.11dist(yappi) python311-yappi python311-yappi(aarch-64) python3dist(yappi)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-setuptools update-alternatives"

inherit rpm
