SUMMARY = "Oxygen style, KWin decoration and cursors"
DESCRIPTION = "Provides Oxygen style, KWin decoration, and cursors."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "oxygen5-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "70186de68976215364e3db326932d85bcfaf7ebb6270182a57bbd1e48875c76467d9c7967a3d8a83a1c66008721ace2191808740761d0aff35d255809fd95fca"

RPROVIDES:${PN} += "oxygen5 oxygen5(aarch-64)"
RDEPENDS:${PN} += "oxygen5-decoration oxygen5-style"

inherit rpm
