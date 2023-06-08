SUMMARY = "Development files for Open Virtual Network"
DESCRIPTION = "Devel libraries and headers for Open Virtual Network."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-devel-23.03.0-13.1.aarch64.rpm"
RPM_HASH = "897ca891ae0dbce1d7c0645f8e0da169763ff265fa3554d976712dee3cf2d0e09d9d4e216b55fbb5d67231dbf94338447408d1705d3ab51aa2014c05398a3693"

RPROVIDES:${PN} += "openvswitch-devel:/usr/include/ovn ovn-devel ovn-devel(aarch-64)"
RDEPENDS:${PN} += "libovn-23_03-0"

inherit rpm
