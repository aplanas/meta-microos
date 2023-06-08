SUMMARY = "Gantt chart library"
DESCRIPTION = "This library implements Gantt chart drawing functionality. It allows \
to easily embed the Gantt charts into the application as long as it \
is capable of drawing QWidget or QGraphicsView objects. \
 \
This package is part of the KDE PIM module."
LICENSE = "GPL-2.0-only"

PV = "16.08.3"

RPM_NAME = "kdgantt2-16.08.3-4.16.aarch64.rpm"
RPM_HASH = "8c11f93c3bb394cac5424a2480bb86c49243d77e953ea9629bc0ce22c63f20fc62e6e9265a622c864d1f4a89e89b4b51ec8f01947b852b76298a441de6702e7a"

RPROVIDES:${PN} += "kdgantt2 kdgantt2(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
