SUMMARY = "Development headers for Boost.URL library"
DESCRIPTION = "This package contains development headers for Boost.URL library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_url1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "6a5582a101523c2c6adf2b4080524f528ec2c04bd7d1bdf444fbe58b54b374b8cdd267a8243f2224ee91f67cc66c6a46a0526260555508575338458a11ce06ad"

RPROVIDES:${PN} += "libboost_url-devel-impl libboost_url1_82_0-devel libboost_url1_82_0-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
