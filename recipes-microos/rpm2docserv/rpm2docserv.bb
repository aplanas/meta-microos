SUMMARY = "Make manpages from RPMs accessible in a web browser"
DESCRIPTION = "rpm2docserv extracts manual pages from RPM packages and makes them accessible in a web browser."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "rpm2docserv-20230308.4ed55cf-1.3.aarch64.rpm"
RPM_HASH = "6928ec0489ab5c6cb93c58a1a8ddece47d28875b0090f24d4a9b4820aeec0669e70f7375b95c91b71741744de0088bb4cb38f99a06edf9d16e147d71d61f4d04"

RPROVIDES:${PN} += "rpm2docserv rpm2docserv(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/mandoc cpio libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
