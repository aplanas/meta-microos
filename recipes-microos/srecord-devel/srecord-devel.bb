SUMMARY = "Srecord development files"
DESCRIPTION = "This package contains libraries and header files for compiling programs \
that manipulate EPROM load files."
LICENSE = "GPL-3.0+"

PV = "1.64"

RPM_NAME = "srecord-devel-1.64-4.32.aarch64.rpm"
RPM_HASH = "6ad368e342b337f77393ed10d9c3cc88ac4d024417e1d10103495dd6d0175e0194442bc897d9cb9ab77246797e11afa12ba960642dc956ad36a51260d16d5d02"

RPROVIDES:${PN} += "pkgconfig(srecord) \
srecord-devel \
srecord-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrecord0"

inherit rpm
