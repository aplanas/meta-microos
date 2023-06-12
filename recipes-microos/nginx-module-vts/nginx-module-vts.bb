SUMMARY = "Nginx virtual host traffic status module"
DESCRIPTION = "This is an Nginx module that provides access to virtual host status \
information. It contains the current status such as servers, upstreams, caches. \
This is similar to the live activity monitoring of nginx plus. The built-in html \
is also taken from the demo page of old version."
LICENSE = "BSD-2-Clause"

PV = "0.1.18+g41"

RPM_NAME = "nginx-module-vts-0.1.18+g41-1.8.aarch64.rpm"
RPM_HASH = "a45685d5f20da0c296c1e79c2340cbedd6afe46b0e061bb8552b9d30a39c33fc9170c8098343bc265b7949e476f289b870772c6ba4e987f86e52c82d63213684"

RPROVIDES:${PN} += "nginx-module-vts nginx-module-vts(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) nginx"

inherit rpm
