SUMMARY = "Nemo extension for filename encoding repair"
DESCRIPTION = "This is a Nemo extension which repairs filename which uses wrong \
encoding in Nemo. This extension provides the context menu for any \
file whose filename uses wrong encoding, so that you cannot read the \
filename in Nemo. \
 \
You can find a candidate for filename in context menu or submenu. \
This extension also provides a decoded name for URL encoded filename."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.0"

RPM_NAME = "nemo-extension-repairer-5.2.0-3.4.aarch64.rpm"
RPM_HASH = "1f09bea23f1fd2cbd08151f5f031b7dee1100eeba8b4d8f460ebd20c660b20797ca1402b8308ccf5797fac9cc42531ff70507854e30dab58db34fa9348d40a06"

RPROVIDES:${PN} += "libnemo-filename-repairer.so()(64bit) \
nemo-extension-repairer \
nemo-extension-repairer(aarch-64) \
nemo-repairer"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnemo-extension.so.1()(64bit) \
nemo"

inherit rpm
