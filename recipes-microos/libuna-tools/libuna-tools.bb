SUMMARY = "Utilities from libuna for Unicode/ASCII Byte Stream conversions"
DESCRIPTION = "Several tools for converting Unicode and ASCII (byte stream) based text."
LICENSE = "LGPL-3.0-or-later"

PV = "20220611"

RPM_NAME = "libuna-tools-20220611-4.5.aarch64.rpm"
RPM_HASH = "9c2e574b9650a5955d90279e1a3b5b50a0b3c76a4a83de58190fde48661aef889b9af8a2afbf785b849dd773c0e5c885328efa166fc711eca9e890e57d8d5a99"

RPROVIDES:${PN} += "libuna-tools \
libuna-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcdatetime.so.1()(64bit) \
libcdatetime.so.1(V_20230115)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libcfile.so.1()(64bit) \
libcfile.so.1(V_20220106)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcnotify.so.1()(64bit) \
libcnotify.so.1(V_20220108)(64bit) \
libuna.so.1()(64bit) \
libuna.so.1(V_20220611)(64bit)"

inherit rpm
