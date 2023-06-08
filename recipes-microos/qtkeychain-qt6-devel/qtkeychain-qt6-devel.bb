SUMMARY = "Development files for libqt6keychain"
DESCRIPTION = "This package contains development files for using the Qt6 keychain API."
LICENSE = "BSD-2-Clause"

PV = "0.13.2"

RPM_NAME = "qtkeychain-qt6-devel-0.13.2-4.1.aarch64.rpm"
RPM_HASH = "3081b2b9e43922ebd2937cebdb2b0f0a32aa6b982a0bcb8ea16ae80a536cd9d299a226b5e72e222195dac84c28dcc08963133e37c5f644ae55a1da286c9b5b88"

RPROVIDES:${PN} += "cmake(Qt6Keychain) qtkeychain-qt6-devel qtkeychain-qt6-devel(aarch-64)"
RDEPENDS:${PN} += "libqt6keychain1"

inherit rpm
