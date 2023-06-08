SUMMARY = "Core utility library for LXQt"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "liblxqt-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "1974ecc8a7949b5f53d141ad655474f1a00818e76cf3de278f180d9e67a80f2cdd5003c10897d13c675d38268c03b4800b5145f218ff5b4719b5fbf6babdec79"

RPROVIDES:${PN} += "liblxqt liblxqt(aarch-64) liblxqt-qt5"
RDEPENDS:${PN} += "/usr/bin/pkexec ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
