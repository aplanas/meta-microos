SUMMARY = "Header files for kquickcharts, a set of charts for QtQuick applications"
DESCRIPTION = "Development files for KQuickCharts, a set of charts that can be used from QtQuick \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kquickcharts-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "6b603fdb67308ce88dce23ba6e760a1bf64d92048185bab7dd272da998d1ea6fd4fa7c8fcedf5bf2eb8bf8d3fb31aac811ea6644410dd59be31c94fccbcc3093"

RPROVIDES:${PN} += "cmake(KF5QuickCharts) kquickcharts-devel kquickcharts-devel(aarch-64)"
RDEPENDS:${PN} += "kquickcharts"

inherit rpm
