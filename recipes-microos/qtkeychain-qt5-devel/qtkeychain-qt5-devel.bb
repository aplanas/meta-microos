SUMMARY = "Development files for the qtkeychain library"
DESCRIPTION = "qtkeychain can be used to store passwords. \
 \
This package contains development files for libqtkeychain."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "qtkeychain-qt5-devel-0.13.2-4.1.aarch64.rpm"
RPM_HASH = "ac286819a0c8b000fffc382132502feac8fce35e52e59a2eb0be5495a13d806978b0818e42becee3e6d99d0a8abd72a9a408090d2a2cb35fcf79480c430b12f0"

RPROVIDES:${PN} += "cmake(Qt5Keychain) qtkeychain-qt5-devel qtkeychain-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "libqt5keychain1"

inherit rpm
