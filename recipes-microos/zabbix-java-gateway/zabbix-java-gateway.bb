SUMMARY = "Zabbix Java gateway"
DESCRIPTION = "JMX monitoring can be used to monitor JMX counters of a Java \
application. To retrieve the value of a particular JMX counter on a \
host, the Zabbix server queries the Zabbix Java gateway, which in \
turn uses the JMX management API to query the application of interest \
remotely."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-java-gateway-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "b49f013598788aebadcfd0c808fa4a60456babbd2f8941a39fd5effda8566b2ab8b6b6169ebd5698c87f4f94faf66c6e63c165443f2448388127389e95742c42"

RPROVIDES:${PN} += "config(zabbix-java-gateway) zabbix zabbix-java-gateway zabbix-java-gateway(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh jre shadow"

inherit rpm
