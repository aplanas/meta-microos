SUMMARY = "Java Basic XPath 2.0, XSLT 2.0, and XQuery 1.0 implementation"
DESCRIPTION = "Release 8.6 represents an important milestone in Saxonica's progressive \
implementation of the XPath 2.0, XSLT 2.0, and XQuery 1.0 \
specifications. Saxon 8.6 is aligned with the W3C Candidate \
Recommendation published on 3 November 2005. It is a complete and \
conformant implementation, providing all the mandatory features of \
those specifications and nearly all the optional features. Saxon is \
available in two versions. Saxon-B is a non-schema-aware processor, and \
is available as an open-source product, free of charge, from \
SourceForge. It is designed to conform to the basic conformance level \
of XSLT 2.0, and the equivalent level of functionality in XQuery 1.0. \
Saxon-SA is the schema-aware version of the package, and is available \
as a commercially supported product from Saxonica Limited. \
 \
This package provides the Basic XSLT 2.0 and XQuery 1.0 processor. \
Includes the command line interfaces and the JAVA APIs; also includes a \
standalone XPath API that doesn't depend on JAXP 1.3."
LICENSE = "MPL-1.1"

PV = "B.8.8"

RPM_NAME = "saxon8-B.8.8-133.6.noarch.rpm"
RPM_HASH = "aa16f17f20481bf5bef04472c08330e84432783d33ef4c68a27227faf796fd85bc470972c0c546ca53c800caa331d94428a0c229f5d811494a92927b0107e3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxp_transform_impl saxon8"
RDEPENDS:${PN} += "/bin/sh /usr/sbin/update-alternatives bea-stax bea-stax-api jaxp_parser_impl"

inherit rpm
