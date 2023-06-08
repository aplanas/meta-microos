SUMMARY = "Auxiliary schema data for libgweather"
DESCRIPTION = "This is a library to download weather information from online sources. \
This package provides the architecture independent files."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "gweather4-data-4.2.0-2.1.aarch64.rpm"
RPM_HASH = "8ed5d6b2cbeac13cb6fdb54a4aa17aafc5873880376d76b100a0efe89bd51020de2d5695ddd7b0c384a930d58730d01b5f6fd241e68d6e8358a2dc9b68df4896"

RPROVIDES:${PN} += "gweather4-data gweather4-data(aarch-64) libgweather4"
RDEPENDS:${PN} += "libgweather-4-0"

inherit rpm
