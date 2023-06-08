SUMMARY = "Java destination support for syslog-ng"
DESCRIPTION = "This package provides Java destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-java-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "19fd122ad138b5e631a7d0c8c3c4b3920b20e6955dc5722387261032dce242530b03c456777d35de9a98dca12cd7bdf245b386410661d7aea7332516a3e363fd"

RPROVIDES:${PN} += "libmod-java.so()(64bit) syslog-ng-java syslog-ng-java(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libjvm.so()(64bit) libjvm.so(SUNWprivate_1.1)(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
