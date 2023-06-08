SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kmailtransport-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "367a5b85553573ea8059b6d70ff2381f90fa15ca688c07e0375e6194ca90789af97b49b792d7916372f6b8f13376d3c91d99ee5afcfce94b37bd721ddaca1414"

RPROVIDES:${PN} += "cmake(KF5MailTransport) cmake(KF5MailTransportAkonadi) cmake(KPim5MailTransport) cmake(KPim5MailTransportAkonadi) kmailtransport-devel kmailtransport-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Wallet) cmake(KPim5AkonadiMime) cmake(KPim5Mime) cyrus-sasl-devel libKPim5MailTransport5 libKPim5MailTransportAkonadi5"

inherit rpm
