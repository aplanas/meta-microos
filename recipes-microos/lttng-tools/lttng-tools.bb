SUMMARY = "Linux Trace Toolkit Next Generation userspace tools"
DESCRIPTION = "This package provides the userspace tools for controlling the LTTng \
subsystem from userspace."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.13.9"

RPM_NAME = "lttng-tools-2.13.9-1.3.aarch64.rpm"
RPM_HASH = "382ff18575f94d5a7c53fe0a97588b2f160fd07067b68ab4b8a4ba9a5ccda568559d7259248e6456badde31ea5db38f8cee544c1d1d0b3135b3b46d141db6f27"

RPROVIDES:${PN} += "lttng-tools \
lttng-tools(aarch-64)"
RDEPENDS:${PN} += "babeltrace \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
liblttng-ctl.so.0()(64bit) \
liblttng-ust-common.so.1()(64bit) \
liblttng-ust-ctl.so.5()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
liburcu-cds.so.8()(64bit) \
liburcu-common.so.8()(64bit) \
liburcu.so.8()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit)"

inherit rpm
