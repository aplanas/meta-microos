SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to InfluxDB"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to InfluxDB (https://influxdata.com/time-series-platform/influxdb)."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2influxdb-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "91bcb70cb1cd26b8857afa8cf044a9309874e9145eff5cb9d37af2ac11e5602032e29d9f662211521200a128ccc0ae920928d32a55e6272707093302cdced19f"

RPROVIDES:${PN} += "pcp-export-pcp2influxdb pcp-export-pcp2influxdb(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env python3-pcp python3-requests"

inherit rpm
