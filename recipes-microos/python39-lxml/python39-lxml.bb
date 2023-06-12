SUMMARY = "Pythonic XML processing library"
DESCRIPTION = "lxml is a Pythonic binding for the libxml2 and libxslt libraries. It \
provides convenient access to these libraries using the ElementTree \
API. It extends the ElementTree API significantly to offer support for XPath, \
RelaxNG, XML Schema, XSLT and C14N."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "4.9.2"

RPM_NAME = "python39-lxml-4.9.2-7.1.aarch64.rpm"
RPM_HASH = "d1158474e54a10775bd2f40c980e7028f101585e132bdabe1b33e83a7a00dee0c0e7312daae55a0bb53bb7c6fff4adb78e0ab8ff77bcba2671f05d42a2e3fab8"

RPROVIDES:${PN} += "python3.9dist(lxml) \
python39-lxml \
python39-lxml(aarch-64) \
python3dist(lxml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libexslt.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.5.9)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.1)(64bit) \
libxml2.so.2(LIBXML2_2.6.10)(64bit) \
libxml2.so.2(LIBXML2_2.6.14)(64bit) \
libxml2.so.2(LIBXML2_2.6.15)(64bit) \
libxml2.so.2(LIBXML2_2.6.16)(64bit) \
libxml2.so.2(LIBXML2_2.6.17)(64bit) \
libxml2.so.2(LIBXML2_2.6.18)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.20)(64bit) \
libxml2.so.2(LIBXML2_2.6.21)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.24)(64bit) \
libxml2.so.2(LIBXML2_2.6.32)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.7.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.4)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit) \
libxslt.so.1()(64bit) \
libxslt.so.1(LIBXML2_1.0.11)(64bit) \
libxslt.so.1(LIBXML2_1.0.18)(64bit) \
libxslt.so.1(LIBXML2_1.0.22)(64bit) \
libxslt.so.1(LIBXML2_1.0.24)(64bit) \
libxslt.so.1(LIBXML2_1.1.2)(64bit) \
libxslt.so.1(LIBXML2_1.1.26)(64bit) \
libxslt.so.1(LIBXML2_1.1.9)(64bit) \
python(abi) \
python39-cssselect"

inherit rpm
