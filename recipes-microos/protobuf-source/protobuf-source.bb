SUMMARY = "Source code of protobuf"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains source code for Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf-source-21.12-3.2.noarch.rpm"
RPM_HASH = "75f583ffdf1cf8d98756c671b4294a7943cf40873984f69d892e6eb0365bd6b20cb4687b630df1be41fb5d3f529cf7f2c6bdb522111fa473ba4b4f8c3b976cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protobuf-source"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/node /usr/bin/python /usr/bin/python2.7 /usr/bin/python3 /usr/bin/ruby"

inherit rpm
