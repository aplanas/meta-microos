SUMMARY = "The Prometheus monitoring system and time series database"
DESCRIPTION = "Prometheus's main features are: \
 - a multi-dimensional data model (time series identified by metric name and key/value pairs) \
 - a flexible query language to leverage this dimensionality \
 - no reliance on distributed storage; single server nodes are autonomous \
 - time series collection happens via a pull model over HTTP \
 - pushing time series is supported via an intermediary gateway \
 - targets are discovered via service discovery or static configuration \
 - multiple modes of graphing and dashboarding support"
LICENSE = "Apache-2.0"

PV = "2.43.1"

RPM_NAME = "golang-github-prometheus-prometheus-2.43.1-1.1.aarch64.rpm"
RPM_HASH = "7e526f796dd88ca4c414a3a206b1dad20194f16cf72556fad2bf6000f8a110891692572322789f250e7899d7668fec9ea820a938fd56e53b64f65aee5a370567"

RPROVIDES:${PN} += "config(golang-github-prometheus-prometheus) golang-github-prometheus-prometheus golang-github-prometheus-prometheus(aarch-64) prometheus"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup group(prometheus) user(prometheus)"

inherit rpm
