SUMMARY = "A simple statsd client"
DESCRIPTION = "statsd is a front-end to Graphite. This is a Python client \
for the statsd daemon."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-statsd-3.3.0-3.5.noarch.rpm"
RPM_HASH = "0daa8fa40a7a1cd5560e3c0e5f5854e2cb1a5be797f1e1484c5c4aee9cc2b2e42c794cc86c40e61a42d048e9060202f8c7cbffa578f4aa9b45167337c07f27fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-statsd \
python3.10dist(statsd) \
python310-statsd \
python3dist(statsd)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
