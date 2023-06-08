SUMMARY = "InfluxDB client"
DESCRIPTION = "InfluxDB-Python is a client for interacting with InfluxDB 1.x"
LICENSE = "MIT"

PV = "5.3.1"

RPM_NAME = "python39-influxdb-5.3.1-2.3.aarch64.rpm"
RPM_HASH = "c2a5d8bff661bdee6c825d9545150ce288e2c7d5035be869b6bccfa283369732252169f9b9b87923e9a42123fdc7b8c3883e0f3f2375c20b78e7952d183e2ca4"

RPROVIDES:${PN} += "python3.9dist(influxdb) python39-influxdb python39-influxdb(aarch-64) python3dist(influxdb)"
RDEPENDS:${PN} += "python(abi) python39-msgpack python39-python-dateutil python39-pytz python39-requests python39-six"

inherit rpm
