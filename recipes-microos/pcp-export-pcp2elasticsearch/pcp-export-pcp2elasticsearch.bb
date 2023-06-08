SUMMARY = "Performance Co-Pilot tools for exporting PCP metrics to ElasticSearch"
DESCRIPTION = "Performance Co-Pilot (PCP) front-end tools for exporting metric values \
to Elasticsearch - a distributed, RESTful search and analytics engine. \
See https://www.elastic.co/community for further details."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-export-pcp2elasticsearch-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "8f510df3b4a483ced9a19dd83e8319c215e6b0c5261857d895a511b3c66d27c5a8331cd388566e5ec603b1e0380a2ee3b265d714eb9cb3b392beb8267b109a9e"

RPROVIDES:${PN} += "pcp-export-pcp2elasticsearch pcp-export-pcp2elasticsearch(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env libpcp3 python3-pcp python3-requests"

inherit rpm
