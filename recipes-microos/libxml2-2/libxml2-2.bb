SUMMARY = "A Library to Manipulate XML Files"
DESCRIPTION = "The XML C library was initially developed for the GNOME project. It is \
now used by many programs to load and save extensible data structures \
or manipulate any kind of XML files. \
 \
This library implements a number of existing standards related to \
markup languages, including the XML standard, name spaces in XML, XML \
Base, RFC 2396, XPath, XPointer, HTML4, XInclude, SGML catalogs, and \
XML catalogs. In most cases, libxml tries to implement the \
specification in a rather strict way. To some extent, it provides \
support for the following specifications, but does not claim to \
implement them: DOM, FTP client, HTTP client, and SAX. \
 \
The library also supports RelaxNG. Support for W3C XML Schemas is in \
progress."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "libxml2-2-2.10.4-2.1.aarch64.rpm"
RPM_HASH = "7f00888c2dbc4b2c955188a91a7a51aff4da82cbcfc896651222c26a2d711897827f5f2e9a960ad3d17d16849bf1eea27bc7e53c1e628c98bf2492a0fbf2668d"

RPROVIDES:${PN} += "libxml2-2 libxml2-2(aarch-64) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.5.4)(64bit) libxml2.so.2(LIBXML2_2.5.5)(64bit) libxml2.so.2(LIBXML2_2.5.6)(64bit) libxml2.so.2(LIBXML2_2.5.7)(64bit) libxml2.so.2(LIBXML2_2.5.8)(64bit) libxml2.so.2(LIBXML2_2.5.9)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.1)(64bit) libxml2.so.2(LIBXML2_2.6.10)(64bit) libxml2.so.2(LIBXML2_2.6.11)(64bit) libxml2.so.2(LIBXML2_2.6.12)(64bit) libxml2.so.2(LIBXML2_2.6.14)(64bit) libxml2.so.2(LIBXML2_2.6.15)(64bit) libxml2.so.2(LIBXML2_2.6.16)(64bit) libxml2.so.2(LIBXML2_2.6.17)(64bit) libxml2.so.2(LIBXML2_2.6.18)(64bit) libxml2.so.2(LIBXML2_2.6.19)(64bit) libxml2.so.2(LIBXML2_2.6.2)(64bit) libxml2.so.2(LIBXML2_2.6.20)(64bit) libxml2.so.2(LIBXML2_2.6.21)(64bit) libxml2.so.2(LIBXML2_2.6.23)(64bit) libxml2.so.2(LIBXML2_2.6.24)(64bit) libxml2.so.2(LIBXML2_2.6.25)(64bit) libxml2.so.2(LIBXML2_2.6.27)(64bit) libxml2.so.2(LIBXML2_2.6.28)(64bit) libxml2.so.2(LIBXML2_2.6.29)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libxml2.so.2(LIBXML2_2.6.32)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) libxml2.so.2(LIBXML2_2.6.6)(64bit) libxml2.so.2(LIBXML2_2.6.7)(64bit) libxml2.so.2(LIBXML2_2.6.8)(64bit) libxml2.so.2(LIBXML2_2.7.0)(64bit) libxml2.so.2(LIBXML2_2.7.3)(64bit) libxml2.so.2(LIBXML2_2.7.4)(64bit) libxml2.so.2(LIBXML2_2.8.0)(64bit) libxml2.so.2(LIBXML2_2.9.0)(64bit) libxml2.so.2(LIBXML2_2.9.1)(64bit) libxml2.so.2(LIBXML2_2.9.11)(64bit) libxml2.so.2(LIBXML2_2.9.8)(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.2.3)(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit)"

inherit rpm
