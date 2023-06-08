SUMMARY = "Development files for the libregraphAPI library"
DESCRIPTION = "Libregraphapi is a MS Graph API influenced API for cloud collaboration. \
 \
This package contains development files for libregraphapi."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "libregraphapi-devel-1.0.1-1.3.aarch64.rpm"
RPM_HASH = "81105703cc36cbbc356690e5c7a101284f8e0eacd73eff3c8ddd17dd2f95ccb756727d4e96db0c4a1a76122b128f325c4dc3fd467322505e479cb725ceebe094"

RPROVIDES:${PN} += "cmake(LibreGraphAPI) libregraphapi-devel libregraphapi-devel(aarch-64)"
RDEPENDS:${PN} += "libLibreGraphAPI1"

inherit rpm
