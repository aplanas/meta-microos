SUMMARY = "SUSE Installation Program"
DESCRIPTION = "SUSE installation program."
LICENSE = "GPL-3.0+"

PV = "8.20"

RPM_NAME = "linuxrc-8.20-1.3.aarch64.rpm"
RPM_HASH = "3904099166ccace5816284001bbd6aa45b560a4472767eca7d5951a7ce053a79ee7f44d79f7aef57f597066db80ae222119b7d6ccc749b0f9abc0ff9d27d9986"

RPROVIDES:${PN} += "linuxrc \
linuxrc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblkid.so.1()(64bit) \
libblkid.so.1(BLKID_1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libhd.so.22()(64bit) \
libmediacheck.so.6()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
