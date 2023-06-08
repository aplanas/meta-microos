SUMMARY = "Utility for finding interesting messages in log files"
DESCRIPTION = "logwarn searches for interesting messages in log files, where ``interest- \
ing'' is defined by an user-supplied list of positive and negative (pre- \
ceeded with a ``!'') extended regular expressions provided on the command \
line. \
 \
Each log message is compared against each pattern in the order given.  If \
the log message matches a positive pattern before matching a negative \
!pattern then it's printed to standard output. \
 \
logwarn keeps track of its position between invocations, so each matching \
line is only ever output once.  It also finds messages in log files that \
have been rotated (and possibly compressed) since the previous invoca- \
tion. \
 \
logwarn also includes support for log messages that span multiple lines."
LICENSE = "Apache-2.0"

PV = "1.0.17"

RPM_NAME = "logwarn-1.0.17-1.3.aarch64.rpm"
RPM_HASH = "976793356e86dc3137c3d2673245c95548c334327026d1e6375b10f710d75a176a0b72f9dda9addc2a276cf8beeb0cde18bad57384a2f432f28c71cda32482fb"

RPROVIDES:${PN} += "logwarn logwarn(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
