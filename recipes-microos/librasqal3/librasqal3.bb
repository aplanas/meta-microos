SUMMARY = "RDF Parser Toolkit for Redland"
DESCRIPTION = "Rasqal is a library providing full support for querying Resource \
Description Framework (RDF) including parsing query syntaxes, \
constructing the queries, executing them and returning result formats. \
It currently handles the RDF Data Query Language (RDQL) and SPARQL \
Query language."
LICENSE = "LGPL-2.1+ | GPL-2.0+ | Apache-2.0+"

PV = "0.9.33"

RPM_NAME = "librasqal3-0.9.33-1.30.aarch64.rpm"
RPM_HASH = "d7c2e813da5cca24b520d5204d05995d0771610a02da0a0923b157174080567daa34ad8de75b80f088b5c2234c450c1642c2de726d53b9cc1fce9299ed42e071"

RPROVIDES:${PN} += "librasqal.so.3()(64bit) librasqal3 librasqal3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmpfr.so.6()(64bit) libpcre.so.1()(64bit) libraptor2.so.0()(64bit)"

inherit rpm
