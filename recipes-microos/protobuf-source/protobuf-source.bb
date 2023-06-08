SUMMARY = "Source code of protobuf"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats. \
 \
This package contains source code for Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf-source-21.12-3.1.noarch.rpm"
RPM_HASH = "cd53e3d3a525a49e996838f672691aeb6833a0b8c40ce1483c88b1d92ec82ce0e6ed605b4a9f266ab825932fdf348dfbcae4fbec76b3cd5d2461dd14918ece75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protobuf-source"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/env /usr/bin/node /usr/bin/python /usr/bin/python2.7 /usr/bin/python3 /usr/bin/ruby"

inherit rpm
