SUMMARY = "CLI tool to scrape a Prometheus client and dump the result as JSON"
DESCRIPTION = "The prom2json CLI tool scrapes a Prometheus client \
in protocol buffer or text format \
and dumps the result as JSON to stdout"
LICENSE = "Apache-2.0"

PV = "1.3.2"

RPM_NAME = "prom2json-1.3.2-1.2.aarch64.rpm"
RPM_HASH = "ebb5993f803af8d89841b134866b62f4cf7e54853085cbd855dfa9bde07ff7e99fee5c08567d31d8a6a73630dbe761beeb9af0a823f9b9a6733011e9f49b8c14"

RPROVIDES:${PN} += "prom2json prom2json(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
