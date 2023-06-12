SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kmailtransport-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "065d02befd921651d695081f9ad93c220546a7c7424e0386af3a61dd3c503046d5297659b60db5b6b6d322d770cea902a5eb3a005addd9610fc8a40ea75b4520"

RPROVIDES:${PN} += "cmake(KF5MailTransport) cmake(KF5MailTransportAkonadi) cmake(KPim5MailTransport) cmake(KPim5MailTransportAkonadi) kmailtransport-devel kmailtransport-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Wallet) cmake(KPim5AkonadiMime) cmake(KPim5Mime) cyrus-sasl-devel libKPim5MailTransport5 libKPim5MailTransportAkonadi5"

inherit rpm
