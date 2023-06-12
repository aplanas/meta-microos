SUMMARY = "File synchronization tool"
DESCRIPTION = "Text based userinterface for Unison. \
 \
Unison is a file synchronization tool for Unix and Windows. It allows \
two replicas of a collection of files and directories to be stored on \
different hosts (or different disks on the same host), modified \
separately, then brought up to date by propagating the changes in each \
replica to the other."
LICENSE = "GPL-3.0+"

PV = "2.53.2"

RPM_NAME = "unison-text-2.53.2-1.1.aarch64.rpm"
RPM_HASH = "6bb9d4d0770eb8aa983518250bc88964531d32598cc7c8b16a9a5cf7fd704077d51f0ffeb3fbbbc2ee8d711ef62a940584efe0ee06574aa364b5a7a92172c716"

RPROVIDES:${PN} += "unison-text \
unison-text(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
