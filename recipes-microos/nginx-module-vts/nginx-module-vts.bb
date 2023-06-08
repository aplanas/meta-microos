SUMMARY = "Nginx virtual host traffic status module"
DESCRIPTION = "This is an Nginx module that provides access to virtual host status \
information. It contains the current status such as servers, upstreams, caches. \
This is similar to the live activity monitoring of nginx plus. The built-in html \
is also taken from the demo page of old version."
LICENSE = "BSD-2-Clause"

PV = "0.1.18+g41"

RPM_NAME = "nginx-module-vts-0.1.18+g41-1.7.aarch64.rpm"
RPM_HASH = "28921f6853bc939d6804ca8d6451c871652a69eb5f54044675cc2df9ddeb4a186435a4e15c402182c77c4871ca812e44295d0c4c54692c290d5eeb323248cd46"

RPROVIDES:${PN} += "nginx-module-vts nginx-module-vts(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) nginx"

inherit rpm
