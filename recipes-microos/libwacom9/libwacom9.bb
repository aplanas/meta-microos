SUMMARY = "Library to identify wacom tablets"
DESCRIPTION = "libwacom is a library to identify wacom tablets and their model-specific \
features. It provides easy access to information such as 'is this a \
built-in on-screen tablet', 'what is the size of this model', etc."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "libwacom9-2.5.0-1.3.aarch64.rpm"
RPM_HASH = "96933b75b5063b4ceb81edd13f7cdd4053c84e86d596b27f07def1de55aa80ec6e302381f068df9f1ec1ce9fb238a70914bf53cc01b5fcb8db25d501cc3b8c95"

RPROVIDES:${PN} += "libwacom.so.9()(64bit) \
libwacom.so.9(LIBWACOM_2.0)(64bit) \
libwacom9 \
libwacom9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgudev-1.0.so.0()(64bit) \
libwacom-data"

inherit rpm
