SUMMARY = "WebSocket protocol handler with pluggable I/O"
DESCRIPTION = "WebSocket protocol handler with pluggable I/O."
LICENSE = "Apache-2.0"

PV = "0.7.5"

RPM_NAME = "ruby3.2-rubygem-websocket-driver-0.7.5-1.13.aarch64.rpm"
RPM_HASH = "f3617241b45c905c1ca687cbbab65296e333568fabea9cf909e65555fbe802a4d3d206bcfd4aca3d242d7c18a3d8e86d6815b53cf624c2d4357be3e75f111b5c"

RPROVIDES:${PN} += "ruby3.2-rubygem-websocket-driver ruby3.2-rubygem-websocket-driver(aarch-64) rubygem(ruby:3.2.0:websocket-driver) rubygem(ruby:3.2.0:websocket-driver:0) rubygem(ruby:3.2.0:websocket-driver:0.7) rubygem(ruby:3.2.0:websocket-driver:0.7.5) rubygem(websocket-driver)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) ruby(abi) rubygem(ruby:3.2.0:websocket-extensions)"

inherit rpm
