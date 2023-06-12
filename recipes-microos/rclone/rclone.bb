SUMMARY = "Rsync for cloud storage"
DESCRIPTION = "rsync for cloud storage. rclone is a command line program to sync files and \
directories to and from a wide variety of cloud storage providers, providing \
various additional features."
LICENSE = "MIT"

PV = "1.62.2"

RPM_NAME = "rclone-1.62.2-2.2.aarch64.rpm"
RPM_HASH = "196bb3814b5168ef977af821773724273a8bc4935a1970f8cc707eda36b2282215307446ed8700c3a4a6e5df0294430c6b7dd6efae36a367905e589e8bd2f5b6"

RPROVIDES:${PN} += "rclone \
rclone(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
