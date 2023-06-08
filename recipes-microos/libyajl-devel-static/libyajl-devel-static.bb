SUMMARY = "Yet Another JSON Library (Static Library)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for linking statically \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-static-2.1.0-6.5.aarch64.rpm"
RPM_HASH = "42ada41f46e2f1459190b2bc48b0d677de0e72e47474b8198d7c6ff160eccb82ff04b927e0d7aa6d49cd2cef3cd2791a47d33489d8839aa850431adf1855a98a"

RPROVIDES:${PN} += "libyajl-devel-static libyajl-devel-static(aarch-64)"
RDEPENDS:${PN} += "libyajl-devel"

inherit rpm
