SUMMARY = "Python implementation of the patiencediff algorithm"
DESCRIPTION = "Python implementation of the patiencediff algorithm."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.12"

RPM_NAME = "python311-patiencediff-0.2.12-1.4.aarch64.rpm"
RPM_HASH = "8b70fbcc53afbfdb914e1f1da8dffa1ee366077889ec6250377a38280c1388cdb92d0c68413ada027cf63ca50d393e8c5755ae0b0c0c759754a7133d4942bb4e"

RPROVIDES:${PN} += "python3.11dist(patiencediff) python311-patiencediff python311-patiencediff(aarch-64) python3dist(patiencediff)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) update-alternatives"

inherit rpm
