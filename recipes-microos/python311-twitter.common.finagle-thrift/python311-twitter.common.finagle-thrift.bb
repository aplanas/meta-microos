SUMMARY = "Thrift stubs for zipkin RPC tracing support in finagle"
DESCRIPTION = "twitter.common.finagle-thrift is a Python library with Thrift stubs for zipkin \
RPC tracing support in finagle. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.9"

RPM_NAME = "python311-twitter.common.finagle-thrift-0.3.9-2.13.aarch64.rpm"
RPM_HASH = "200813613e25838332bd01b898c7f0f61c22f46645a560ff68bf84eeeec0d7541e21fc7e48c9ad1c4be9d6795a5c43bfa1ddd10823a8cc2a4fd6a1540f3726f8"

RPROVIDES:${PN} += "python3.11dist(twitter.common.finagle-thrift) python311-twitter.common.finagle-thrift python311-twitter.common.finagle-thrift(aarch-64) python3dist(twitter.common.finagle-thrift)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
