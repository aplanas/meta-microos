SUMMARY = "Plymouth core library"
DESCRIPTION = "This package contains the libply library used by Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "libply5-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "82425ccbaffb42de92a982ae76d46b2c9c867f9304f0a791db3316c9a714f6ab05e5cd50bbc5acefab7c1b269c24ea121fd79aeaac9b66ed3c145754508cc665"

RPROVIDES:${PN} += "libply.so.5()(64bit) libply5 libply5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
