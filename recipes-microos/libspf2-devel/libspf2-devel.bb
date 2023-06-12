SUMMARY = "Development files for libspf"
DESCRIPTION = "The libspf2-devel package contains the header files and static \
libraries necessary for developing programs using the libspf2 (Sender \
Policy Framework) library. \
 \
If you want to develop programs that will look up and process SPF records, \
you should install libspf2-devel. \
 \
API documentation is in the separate libspf2-apidocs package."
LICENSE = "BSD-2-Clause | LGPL-2.1-or-later"

PV = "1.2.11"

RPM_NAME = "libspf2-devel-1.2.11-6.12.aarch64.rpm"
RPM_HASH = "553bb0b92fcdda76f8000e6dd94ca3a3036f98350146cc3e97351ce1dcb290c6f06cd33f4834b1ba33167ff65265a3952d1707aec1be42b8e49d41d0253459c8"

RPROVIDES:${PN} += "libspf2-devel \
libspf2-devel(aarch-64)"
RDEPENDS:${PN} += "libspf2-2"

inherit rpm
