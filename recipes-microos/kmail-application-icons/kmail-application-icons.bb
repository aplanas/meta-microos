SUMMARY = "mail client icon"
DESCRIPTION = "The KMail application icon that is shared with a number of applications"
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "kmail-application-icons-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "aef63bec5a6672a46aa785ecfcdc9e123fe177d9efd9aca0a99fdef770b4ec099b32670749fa10ba1dbc0787bf9a0d1cbff9f5f15499fb6939ca5dd465825f72"

RPROVIDES:${PN} += "kmail-application-icons kmail-application-icons(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
