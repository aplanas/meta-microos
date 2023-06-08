SUMMARY = "Documentation for iio-sensor-proxy"
DESCRIPTION = "This package contains the documentation for iio-sensor-proxy."
LICENSE = "GPL-3.0-only"

PV = "3.4"

RPM_NAME = "iio-sensor-proxy-doc-3.4-2.3.noarch.rpm"
RPM_HASH = "61574d4cee35a8f0319ba5cb00812aae2ca3a8271ab2205e9ee4198b083f5e748ddbb529481ae0162f06d99b0a3a472506a96cd6204fdad6fb8bb71309369931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iio-sensor-proxy-doc"
RDEPENDS:${PN} += ""

inherit rpm
