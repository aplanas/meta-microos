SUMMARY = "Linux Trace Toolkit Userspace Tracer library"
DESCRIPTION = "This library may be used by user space applications to generate \
tracepoints within the kernel LTT subsystem."
LICENSE = "GPL-2.0-only"

PV = "2.13.5"

RPM_NAME = "liblttng-ust1-2.13.5-1.3.aarch64.rpm"
RPM_HASH = "d887dc92b7f78a520955bca86660bb411f8b028c515692046535f71acfe01a53df300290d1cfbb0781a06d1d0f6bae3de846cfa57a22375951fc810d4f4f2128"

RPROVIDES:${PN} += "liblttng-ust-common.so.1()(64bit) liblttng-ust-cyg-profile-fast.so.1()(64bit) liblttng-ust-cyg-profile.so.1()(64bit) liblttng-ust-dl.so.1()(64bit) liblttng-ust-fd.so.1()(64bit) liblttng-ust-fork.so.1()(64bit) liblttng-ust-libc-wrapper.so.1()(64bit) liblttng-ust-pthread-wrapper.so.1()(64bit) liblttng-ust-tracepoint.so.1()(64bit) liblttng-ust.so.1()(64bit) liblttng-ust1 liblttng-ust1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libnuma.so.1()(64bit) libnuma.so.1(libnuma_1.1)(64bit) libnuma.so.1(libnuma_1.2)(64bit)"

inherit rpm
