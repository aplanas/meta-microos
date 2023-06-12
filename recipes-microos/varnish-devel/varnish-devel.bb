SUMMARY = "Development files for Varnish"
DESCRIPTION = "Varnish is an HTTP accelerator. Often called Reverse Proxy, it is an \
application that stores (caches) documents that have been requested \
over the HTTP protocol. \
 \
This package holds the development files for varnish."
LICENSE = "BSD-2-Clause"

PV = "7.2.1"

RPM_NAME = "varnish-devel-7.2.1-1.3.aarch64.rpm"
RPM_HASH = "d603a67c2a29f43525dd804f7631e8c3e126d9d85edf9b795d0ef5a3ed1a7da5d72ac9114b2515af79c568466f2eb38a91e6257627e78e97bb734a17e24929cf"

RPROVIDES:${PN} += "pkgconfig(varnishapi) \
varnish-devel \
varnish-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
varnish"

inherit rpm
