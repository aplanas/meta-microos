SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files.  The library documentation is available on header \
files. \
 \
This library is used by kipi-plugins, digiKam and others kipi host \
programs."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkdcraw-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8c4fc7b6ee5d9d980829c051fcb9cb10718dbe60568202d98e2352744a44c7091fa8eee2fc17aef4c624f455de6c29ae4814e79f6c00aca157702a71e681489d"

RPROVIDES:${PN} += "cmake(KF5KDcraw) \
libkdcraw-devel \
libkdcraw-devel(aarch-64) \
libkdcraw-kf5-devel"
RDEPENDS:${PN} += "libKF5KDcraw5"

inherit rpm
