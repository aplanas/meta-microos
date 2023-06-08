SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files.  The library documentation is available on header \
files. \
 \
This library is used by kipi-plugins, digiKam and others kipi host \
programs."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkdcraw-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d56d06fc9496236150a234c1ce58c8734905b8139a52564e814cc10384de3f649cd6be5d423c6d9167579d135979460c0c719e0964e4f99094df60d4a5b54352"

RPROVIDES:${PN} += "cmake(KF5KDcraw) libkdcraw-devel libkdcraw-devel(aarch-64) libkdcraw-kf5-devel"
RDEPENDS:${PN} += "libKF5KDcraw5"

inherit rpm
