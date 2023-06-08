SUMMARY = "Library for dropping ambient capabilities"
DESCRIPTION = "This library can be used via LD_PRELOAD to force an application started with ambient capabilities to drop them. \
It leaves other capabilities intact. This can also be linked against and automatically does the right thing. \
You do not need to make any calls into the library because all the work is done in the constructor which runs before main() is called."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libdrop_ambient0-0.8.3-1.8.aarch64.rpm"
RPM_HASH = "e149d4ac7a1ab252f0ae9d0de2072bbb84c335dca76df57e534a7da760d4529b45bea1b87b9c6f6c30f896328fc522dc5f76a398172e789363d5857750cfa403"

RPROVIDES:${PN} += "libdrop_ambient.so.0()(64bit) libdrop_ambient0 libdrop_ambient0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libcap-ng0"

inherit rpm
