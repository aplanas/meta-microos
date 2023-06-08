SUMMARY = "Check cups service"
DESCRIPTION = "Check the status of a remote CUPS server, all printers there \
or one selected. It can also check queue there: \
it will provide the size of the queue of age of queue."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-cups-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "56254fa42d74e494cf3d9e7438872ca77ffe19d1ccc3e92c2f8c0a12645c54b9febfa370ea5bebbba4d3adfa5ac647b8ed8fddd2a8ad241c20ae41ac54b05da1"

RPROVIDES:${PN} += "config(monitoring-plugins-cups) monitoring-plugins-cups monitoring-plugins-cups(aarch-64) nagios-plugins-cups"
RDEPENDS:${PN} += "/bin/bash cups-client"

inherit rpm
