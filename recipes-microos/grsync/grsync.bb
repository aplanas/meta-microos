SUMMARY = "GUI for rsync"
DESCRIPTION = "Grsync is a GUI (Graphical User Interface) for rsync, the commandline directory \
and file synchronization tool. It can be effectively used to synchronize local \
directories and it supports remote targets as well (even though it doesn't \
support browsing the remote folder). Sample uses of grsync include: synchronize \
a music collection with removable devices, backup personal files to a networked \
drive, replication of a partition to another one, mirroring of files, etc."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "grsync-1.3.0-1.12.aarch64.rpm"
RPM_HASH = "97f1320fdce0d04138935f79817ad3ff866683125b2f2d406ed12a013e2f43373a34d8ebe69e99d58898a6a31dfa86c35611562ee0e13c6d39b8111eb61470f6"

RPROVIDES:${PN} += "application() \
application(grsync.desktop) \
grsync \
grsync(aarch-64) \
metainfo() \
metainfo(grsync.appdata.xml) \
mimehandler(application/x-grsync-session)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
rsync"

inherit rpm
