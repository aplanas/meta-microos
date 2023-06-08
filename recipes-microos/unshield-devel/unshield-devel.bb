SUMMARY = "Header files, libraries and development documentation for libunshield0"
DESCRIPTION = "This package contains the header files, static libraries and development \
documentation for libunshield0. If you like to develop programs using libunshield0, \
you will need to install unshield-devel."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "unshield-devel-1.5.1-1.10.aarch64.rpm"
RPM_HASH = "5a87a39537060bb4a803d9cdf5533b70370ace3ddb2480a0f5abe6365e20e2f52d9be159871f4e12360d4c0a4a306deee74760e846e57b3fc1cf079ac7157769"

RPROVIDES:${PN} += "libunshield pkgconfig(libunshield) unshield-devel unshield-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libunshield0"

inherit rpm
