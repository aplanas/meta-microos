SUMMARY = "System files for the Zabbix proxy"
DESCRIPTION = "The Zabbix proxy component."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.12"

RPM_NAME = "zabbix-proxy-6.0.12-1.4.aarch64.rpm"
RPM_HASH = "c96713ae3629aca646fced8cb1713af7b3977f011189538eab3423bd5d673be745923fca1b8622895b61059415d1c27ea9b7109e46e814bdcf5756b3af601695"

RPROVIDES:${PN} += "config(zabbix-proxy) zabbix-proxy zabbix-proxy(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup fping logrotate shadow update-alternatives zabbix_proxy_binary"

inherit rpm
