SUMMARY = "Qt Wrapper around TpLogger client library"
DESCRIPTION = "Telepathy-logger-qt5 is a Qt Wrapper around the TpLogger client library. \
It is needed by KDE Telepathy in order to log the chat activity."
LICENSE = "LGPL-2.1-or-later"

PV = "17.09.0"

RPM_NAME = "telepathy-logger-qt5-devel-17.09.0-1.16.aarch64.rpm"
RPM_HASH = "3532b52849fd074bc0c3c3ee0ee68cd4b0eae6e17f197b41c5b504fc07e2b02b383a7ded1438be04ae2ccd401a4cce2facc158b412f5075617be8ca9ff3cde8e"

RPROVIDES:${PN} += "cmake(TelepathyLoggerQt) telepathy-logger-qt5-devel telepathy-logger-qt5-devel(aarch-64)"
RDEPENDS:${PN} += "libtelepathy-logger-qt5 telepathy-glib-devel telepathy-logger-devel"

inherit rpm
