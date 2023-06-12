SUMMARY = "Library for dropping ambient capabilities"
DESCRIPTION = "This library can be used via LD_PRELOAD to force an application started with ambient capabilities to drop them. \
It leaves other capabilities intact. This can also be linked against and automatically does the right thing. \
You do not need to make any calls into the library because all the work is done in the constructor which runs before main() is called."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libdrop_ambient0-0.8.3-2.1.aarch64.rpm"
RPM_HASH = "3afad98be9d16fc689bb0d5b6758dc3676786e819ccc2429e4f254bb6260d5aba47ce56e79baedaabebce9a07428fc806e7ff98ee59a1ba03bb8053ae77e87e1"

RPROVIDES:${PN} += "libdrop_ambient.so.0()(64bit) libdrop_ambient0 libdrop_ambient0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libcap-ng0"

inherit rpm
