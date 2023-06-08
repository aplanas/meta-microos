SUMMARY = "A stats collection and distributed tracing framework"
DESCRIPTION = "OpenCensus - A stats collection and distributed tracing framework \
 \
OpenCensus provides a framework to measure a server's resource usage \
and collect performance stats. This repository contains Python related \
utilities and supporting software needed by OpenCensus."
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python39-opencensus-0.11.0-1.3.noarch.rpm"
RPM_HASH = "631fe4975b1a71888dbdf7bd5b8f3ed5820a797a0b5942f6f10ea79327b30cad721b2133765ac1c66c9f5b54551eb3c39c2895482fe8736d863eb4edeaed1224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(opencensus) python39-opencensus python3dist(opencensus)"
RDEPENDS:${PN} += "python(abi) python39-google-api-core python39-opencensus-context"

inherit rpm
