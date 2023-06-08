SUMMARY = "BasicTracer reference implementation for OpenTracing"
DESCRIPTION = "Python 'BasicTracer' reference implementation for OpenTracing."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python311-basictracer-3.2.0-2.6.noarch.rpm"
RPM_HASH = "6a9f9e7e210bc8812f834d89aef3b22dbc9dfc37f2c984353b342056fdf6c3f6bd770e2823c0c9a93c083589c0da0e9623fbd5b102b8fe8d0d82120ec7d1023c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(basictracer) python311-basictracer python3dist(basictracer)"
RDEPENDS:${PN} += "python(abi) python311-opentracing python311-protobuf python311-six"

inherit rpm
