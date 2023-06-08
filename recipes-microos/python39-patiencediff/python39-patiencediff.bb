SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "python39-patiencediff-0.2.12-1.4.aarch64.rpm"
RPM_HASH = "3cc7ff9551af2e7e781da319ae3b0ef272dd9b464416bc85316401f9851b8d5bc3edfd59e2f66b70a88692df370007457d63ef7c9f05e32748e9dcd6b0ac514a"

RPROVIDES:${PN} += "python3.9dist(patiencediff) python39-patiencediff python39-patiencediff(aarch-64) python3dist(patiencediff)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) update-alternatives"

inherit rpm
