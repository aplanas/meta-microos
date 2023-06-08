SUMMARY = "Yet Another JSON Library (Development Environment)"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator. \
 \
This package provides the necessary environment for compiling and linking \
against libyajl."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl-devel-2.1.0-6.5.aarch64.rpm"
RPM_HASH = "c1dc079a37c02fbaf840453c0fda4d5a017d7b69e15f023d74a7fcaa6fda69460fbe7518a0e8936147337d20bf60c6059fd7166ecf351a32dda0601aaf51634a"

RPROVIDES:${PN} += "libyajl-devel libyajl-devel(aarch-64) pkgconfig(yajl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libyajl2"

inherit rpm
