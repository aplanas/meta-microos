SUMMARY = "Web Toolkit - Development Files"
DESCRIPTION = "Development files for the Wt library. \
 \
Wt is a C++ library and application server for developping and \
deploying web applications. The widget-centric API is inspired by \
existing C++ GUI APIs. It offers complete abstraction of any \
web-specific implementation details.  Most imporantly, the entire \
application is written in only one compiled language (C++), from which \
the library generates the necessary HTML, Javascript, CGI, and AJAX \
code."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "wt-devel-4.8.1-3.6.aarch64.rpm"
RPM_HASH = "b31c9043118e944e7fda65cae0d6840727807515e66b55bc3c92a7e99e1b195719fa5b6c72306b185c3fbd61a6c8c0a57b74e2ece3cf60553ba9831a3790bf85"

RPROVIDES:${PN} += "cmake(wt) \
wt-devel \
wt-devel(aarch-64)"
RDEPENDS:${PN} += "FastCGI-devel \
Xerces-c-devel \
boost-devel \
cmake \
mxml-devel \
pkgconfig(openssl) \
wt \
wt-dbo \
wt-dbo-mysql \
wt-dbo-postgres"

inherit rpm
