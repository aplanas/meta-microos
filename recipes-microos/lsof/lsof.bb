SUMMARY = "A Program That Lists Information about Files Opened by Processes"
DESCRIPTION = "Lsof lists information about files opened by processes. An open file \
may be a regular file, a directory, a block special file, a character \
special file, an executing text reference, a library, a stream, or a \
network file (Internet socket, NFS file, or UNIX domain socket.)  A \
specific  file or all the files in a file system may be selected by \
path."
LICENSE = "Zlib"

PV = "4.98.0"

RPM_NAME = "lsof-4.98.0-1.3.aarch64.rpm"
RPM_HASH = "3383885d2a428dcb0c2400587683cbf25445ca4dde631fa0bc45fa3e8a5b9eb03ce1c4a5c27f25e459cb22ceea3fc142b7e03a8eec78f213e525cbc1f5135e7a"

RPROVIDES:${PN} += "lsof lsof(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit)"

inherit rpm
