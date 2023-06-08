SUMMARY = "Logitech Unifying Receiver configuration library"
DESCRIPTION = "A library to configure and handle the /dev hidraw devices belonging \
to the 'Unifying' wireless receiver."
LICENSE = "MIT"

PV = "0.17"

RPM_NAME = "liblur3-0.17-1.3.aarch64.rpm"
RPM_HASH = "bceb3fb6775c302081fb3effa77f5a35ca6899a331b82c130440c183dabad55ae32584c92eac3f27153692a097c9baf39c309cb74d29612bb1195a76f856c917"

RPROVIDES:${PN} += "liblur.so.3()(64bit) liblur.so.3(LIBLUR_0.4.0)(64bit) liblur3 liblur3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
