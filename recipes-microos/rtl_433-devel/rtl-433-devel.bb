SUMMARY = "Header files for the RTL2832 dongle library"
DESCRIPTION = "Turns RTL2832 dongle into a 433.92MHz generic data receiver. \
 \
This subpackage contains header files for developing applications that want \
to make use of rtl_433."
LICENSE = "GPL-2.0-only"

PV = "22.11"

RPM_NAME = "rtl_433-devel-22.11-1.3.aarch64.rpm"
RPM_HASH = "64acd1a7606fc31c85852b5ffd038259955c3ff677875d88c3a54450158ee967b3d4baeb6ba205865222818d40a8132826cbea29eec7fcc6cf64695e81b24e98"

RPROVIDES:${PN} += "rtl_433-devel \
rtl_433-devel(aarch-64)"
RDEPENDS:${PN} += "rtl_433"

inherit rpm
