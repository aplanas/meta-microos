SUMMARY = "Non-ABI stable experimental API for the Qt5 Location Library"
DESCRIPTION = "This package provides private headers of libqt5-qtlocation that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libqt5-qtlocation-private-headers-devel-5.15.9+kde5-1.2.noarch.rpm"
RPM_HASH = "0417d798a6ff88f0c71381e4495eacde420ccabea880b44e23644d19c2547b130055806c364344a359b94a98b47b57c7e8f667e2de1c0c819429c7a33aba5bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtlocation-private-headers-devel"
RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtlocation-devel"

inherit rpm
