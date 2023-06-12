SUMMARY = "Prometheus Alertmanager receiver for SNMP traps"
DESCRIPTION = "prometheus-webhook-snmp is a Prometheus Alertmanager receiver that \
translates incoming notifications into SNMP traps."
LICENSE = "GPL-3.0"

PV = "1.4"

RPM_NAME = "prometheus-webhook-snmp-1.4-2.6.noarch.rpm"
RPM_HASH = "61e8d39b74b68e80cd2a5f4c198f58198337d72413ccb6a026212b98fbac99cc2b67e70703d70fd7733117ca6eab811d23757539b32c41c2b16fa76efcf89df9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-webhook-snmp"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
python(abi) \
python3-CherryPy \
python3-PyYAML \
python3-click \
python3-dateutil \
python3-prometheus_client \
python3-pysnmp"

inherit rpm
