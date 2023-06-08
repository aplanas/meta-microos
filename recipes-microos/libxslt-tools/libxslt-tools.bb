SUMMARY = "Extended Stylesheet Language (XSL) Transformation utilities"
DESCRIPTION = "This package contains xsltproc, a command line interface to the XSLT engine. \
xtend the"
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.1.37"

RPM_NAME = "libxslt-tools-1.1.37-1.3.aarch64.rpm"
RPM_HASH = "88b80718dfb7968c3e2b6e834c44b71624c321139ec44625db84e127cc838f3992efaab1a44981a2f3e96eed98f1e5baf295215fd5ce4d9e5eedf019ce10d2d3"

RPROVIDES:${PN} += "libxslt libxslt-tools libxslt-tools(aarch-64) xsltproc"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libexslt.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libxslt.so.1()(64bit) libxslt.so.1(LIBXML2_1.0.11)(64bit) libxslt.so.1(LIBXML2_1.0.17)(64bit) libxslt.so.1(LIBXML2_1.0.18)(64bit) libxslt.so.1(LIBXML2_1.0.22)(64bit) libxslt.so.1(LIBXML2_1.0.24)(64bit) libxslt.so.1(LIBXML2_1.1.2)(64bit)"

inherit rpm
