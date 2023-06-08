SUMMARY = "Wireshark library for tapping"
DESCRIPTION = "Wiretap, part of the Wireshark project, is a library that allows one to read \
and write several packet capture file formats."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.5"

RPM_NAME = "libwiretap13-4.0.5-1.1.aarch64.rpm"
RPM_HASH = "91b86118ef9f1ea581100a32406e08a9b030860a50542120dac6ac6f9a621081b35b52d8f35629482d87dccdb194d4915c7be082218439745b88c4553c17f99f"

RPROVIDES:${PN} += "libwiretap.so.13()(64bit) libwiretap13 libwiretap13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) liblz4.so.1()(64bit) libwsutil.so.14()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.2.4)(64bit) libzstd.so.1()(64bit)"

inherit rpm
