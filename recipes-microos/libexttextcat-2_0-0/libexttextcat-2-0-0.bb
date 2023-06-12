SUMMARY = "Text categorization library"
DESCRIPTION = "The libexttextcat is a library implementing N-gram-based text categorization"
LICENSE = "BSD-4-Clause"

PV = "3.4.6"

RPM_NAME = "libexttextcat-2_0-0-3.4.6-1.3.aarch64.rpm"
RPM_HASH = "8a4313bd4c264352c83e51e2730dca95a55fe5f17801d61ef8b9cb55db2e9b33746517b02653c7884d6cde62c2079527b0c8ec2cb63de46047691f4fe00b82ba"

RPROVIDES:${PN} += "libexttextcat-2.0.so.0()(64bit) \
libexttextcat-2_0-0 \
libexttextcat-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexttextcat"

inherit rpm
