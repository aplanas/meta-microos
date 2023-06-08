SUMMARY = "Thrift stubs for zipkin RPC tracing support in finagle"
DESCRIPTION = "twitter.common.finagle-thrift is a Python library with Thrift stubs for zipkin \
RPC tracing support in finagle. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.9"

RPM_NAME = "python310-twitter.common.finagle-thrift-0.3.9-2.13.aarch64.rpm"
RPM_HASH = "83ce58c750102613f53f3bed02e12ba56cb642b0ba0d1972553860261c1354e39a958bbf01c07016d131c0223768f279b2e0551b69b596b215da807f86c9c38d"

RPROVIDES:${PN} += "python3-twitter.common.finagle-thrift python3.10dist(twitter.common.finagle-thrift) python310-twitter.common.finagle-thrift python310-twitter.common.finagle-thrift(aarch-64) python3dist(twitter.common.finagle-thrift)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
