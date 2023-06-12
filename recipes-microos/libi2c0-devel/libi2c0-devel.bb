SUMMARY = "Development files for the I2C/SMBus bus access library"
DESCRIPTION = "libi2c offers a way for applications to interact with the devices \
connected to the I2C or SMBus buses of the system."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3"

RPM_NAME = "libi2c0-devel-4.3-1.7.aarch64.rpm"
RPM_HASH = "1ca455f0fd2deb3deaeedb6e12db8ea5b54a97274b76bbadc03bed372e48428f49a7206227d94d48296d5341a02956e267978a7d6c1a6b5bf3dde5fe36095cd3"

RPROVIDES:${PN} += "/usr/include/i2c/smbus.h \
libi2c0-devel \
libi2c0-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libi2c0"

inherit rpm
