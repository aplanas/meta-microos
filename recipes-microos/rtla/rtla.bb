SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "rtla-6.3.1-5.1.aarch64.rpm"
RPM_HASH = "e63e534e26dfc09a44badc6079c3a6fb05456bed1a906b255f150401ad33d4492deb5e256752fc22e62c2e9825e5b87e7c5d8610eee571bc05aec17582d682c7"

RPROVIDES:${PN} += "rtla rtla(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtraceevent.so.1()(64bit) libtracefs.so.1()(64bit)"

inherit rpm
