SUMMARY = "Thrift helpers including finagle and SSL transports"
DESCRIPTION = "twitter.common.rpc is a Python library with Thrift helpers including finagle \
and SSL transport. It's a part of twitter.common set of libraries."
LICENSE = "Apache-2.0"

PV = "0.3.11"

RPM_NAME = "python310-twitter.common.rpc-0.3.11-1.15.aarch64.rpm"
RPM_HASH = "3a6e111cb272f989c77bccafc01328222ba02ef9217b97a47cb5129183aa4a5ae7d125d0611dccbbba61f059e0d6238590743f03b65753f4d8cf5f877aa50317"

RPROVIDES:${PN} += "python3-twitter.common.rpc python3.10dist(twitter.common.rpc) python310-twitter.common.rpc python310-twitter.common.rpc(aarch-64) python3dist(twitter.common.rpc)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
