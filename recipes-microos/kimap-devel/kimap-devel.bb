SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains development headers to add IMAP support to PIM \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kimap-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d67f94d05ae5fe2e6c94eb518d796d9f2999a75686c7fff7dfabad6031d8eef2200ff2529f8ecd9f487a71e957d9615de9c318e96005614a5c2f1b5070237f4e"

RPROVIDES:${PN} += "cmake(KF5IMAP) cmake(KPim5IMAP) kimap-devel kimap-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5CoreAddons) cmake(KPim5Mime) cyrus-sasl-devel libKPim5IMAP5"

inherit rpm
