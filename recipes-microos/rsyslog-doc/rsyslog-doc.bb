SUMMARY = "Additional documentation for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional documentation for rsyslog."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-doc-8.2212.0-2.4.aarch64.rpm"
RPM_HASH = "7bc94d1be0145239d75c9e04b0ae7e74e5c15de10db64583f208c4e87105698cddc809ef07c95f0ffc100fdd9d7737df236a959593a8b8ce015ae05efc5fcef7"

RPROVIDES:${PN} += "rsyslog-doc rsyslog-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
