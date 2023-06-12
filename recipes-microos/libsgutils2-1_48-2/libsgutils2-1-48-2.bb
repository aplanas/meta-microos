SUMMARY = "Library to hold functions common to the SCSI utilities"
DESCRIPTION = "The sg3_utils package contains utilities that send SCSI commands to \
devices. As well as devices on transports traditionally associated with \
SCSI (e.g. Fibre Channel (FCP), Serial Attached SCSI (SAS) and the SCSI \
Parallel Interface(SPI)) many other devices use SCSI command sets. \
ATAPI cd/dvd drives and SATA disks that connect via a translation layer \
or a bridge device are examples of devices that use SCSI command sets. \
 \
This subpackage contains the library of common sg_utils code, such as \
SCSI error processing."
LICENSE = "BSD-3-Clause"

PV = "1.48~20221101+1.142dace"

RPM_NAME = "libsgutils2-1_48-2-1.48~20221101+1.142dace-1.3.aarch64.rpm"
RPM_HASH = "1c302b06163ff0b35b8a435c9897a7646612c2e15abef9c65d3312cc9776b69db839116feca1b111855acc5402bf46d22bfa7a376ffb957f375bc6f8cc8171f5"

RPROVIDES:${PN} += "libsgutils2-1.48.so.2()(64bit) \
libsgutils2-1_48-2 \
libsgutils2-1_48-2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
