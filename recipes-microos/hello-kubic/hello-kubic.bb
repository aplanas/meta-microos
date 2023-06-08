SUMMARY = "A mini webserver showing a hello kubic page"
DESCRIPTION = "hello-kubic is a mini webserver with a 'Hello Kubic' webpage \
containing some informations about the running system, container \
or pod."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "hello-kubic-1.4.1-1.5.aarch64.rpm"
RPM_HASH = "273dc903bdcddbbbc53a5138de0a94688e5052a7791092c007f7eae829870391915f9b21be1be6d34916568314606016e6f39cb7ccb72c9f7b4ccedb72ba2a58"

RPROVIDES:${PN} += "hello-kubic hello-kubic(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
