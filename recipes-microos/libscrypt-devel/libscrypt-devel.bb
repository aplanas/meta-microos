SUMMARY = "Development files for libscrypt"
DESCRIPTION = "The libscrypt-devel package contains libraries and header files for developing applications that use libscrypt."
LICENSE = "BSD-1-Clause"

PV = "1.22"

RPM_NAME = "libscrypt-devel-1.22-1.2.aarch64.rpm"
RPM_HASH = "0db20159d501e516ba078f2d343f933597f7006cec7bdf0a71cac8c71b2418bdb80101ca5ed3e789bf505e47a73125afc10c19debfbc757d58f5ffccdf00b302"

RPROVIDES:${PN} += "libscrypt-devel \
libscrypt-devel(aarch-64)"
RDEPENDS:${PN} += "libscrypt0"

inherit rpm
