SUMMARY = "Check mail queues"
DESCRIPTION = "This plugin checks the number of messages in the mail queue (supports multiple \
sendmail queues, qmail)."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-mailq-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "d103e93f3c866ea1e509721f3f2f8ac7356592adb182c8af27bf22194d259e2d3bee536eee0e5596fe8b959c6ce4c305f045727bb8e68d8c9ac223804b622c08"

RPROVIDES:${PN} += "config(monitoring-plugins-mailq) \
monitoring-plugins-mailq \
monitoring-plugins-mailq(aarch-64) \
nagios-plugins-mailq"
RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl \
smtp_daemon"

inherit rpm
