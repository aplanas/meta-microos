SUMMARY = "Java destination support for syslog-ng"
DESCRIPTION = "This package provides Java destination support for syslog-ng."
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-java-4.2.0-1.1.aarch64.rpm"
RPM_HASH = "1975013704444f6a34545bdb253579020efcbee3662d7b239dfc371fa5806126bbf8a7957530d09157aac0305bfd772b532c46c6f623dc1f93891633e2b2569f"

RPROVIDES:${PN} += "syslog-ng-java \
syslog-ng-java(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libjvm.so()(64bit) \
libjvm.so(SUNWprivate_1.1)(64bit) \
libsyslog-ng-4.2.so.0()(64bit) \
syslog-ng"

inherit rpm
