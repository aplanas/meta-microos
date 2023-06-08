SUMMARY = "Instant Messenger - Development Files"
DESCRIPTION = "Kopete is the KDE instant messenger and supports multiple protocols."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kopete-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "400526a3b32fbd420446cc4e96803785af4a77fe0f8b37e4bac395588b983818163a96ab1f3318eecbb4c2aa3aa901056abe472bb064feb081729561aa2d2cb7"

RPROVIDES:${PN} += "kopete-devel kopete-devel(aarch-64)"
RDEPENDS:${PN} += "kopete"

inherit rpm
