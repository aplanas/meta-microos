SUMMARY = "InfluxDB development files"
DESCRIPTION = "Go sources and other development files for InfluxDB"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "influxdb-devel-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "a95a9bf29f1f137495eed9ff95d78393b4c0794ad55e165fed6ee1d5346425a5fdb4cc4c0f9df217f0cc11aad4d20554f3a738b443ff2253cd5fd30e735bf6b4"

RPROVIDES:${PN} += "influxdb-devel influxdb-devel(aarch-64)"
RDEPENDS:${PN} += "go"

inherit rpm
