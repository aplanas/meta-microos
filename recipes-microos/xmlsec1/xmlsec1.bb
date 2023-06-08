SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-1.2.37-2.2.aarch64.rpm"
RPM_HASH = "7788e370510d68e65422cf3a9fd84f0716b17f5f49c5b699822b8a18c2802f7a47c5cd0e97cf37c4a5af453516cbaedf62557595c1c313db46748957f71fe81c"

RPROVIDES:${PN} += "xmlsec1 xmlsec1(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxmlsec1.so.1()(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit)"

inherit rpm
