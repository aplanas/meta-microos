SUMMARY = "Qt 5 addon providing access to numerous types of archives: Build Environment"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice. Development files"
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "karchive-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "cbd223c1bf7049b9e666286804c9a8cbb0836fb4093ebf7ce8eede1d8895d66028c14c522b8831e66c758f4b3987bf41453f710744833048ceab1ad3f217fe01"

RPROVIDES:${PN} += "cmake(KF5Archive) karchive-devel karchive-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) extra-cmake-modules libKF5Archive5"

inherit rpm
