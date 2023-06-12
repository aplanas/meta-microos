SUMMARY = "Library for Uniform Presentation of fvwm95 Programs"
DESCRIPTION = "This package contains a library for uniform presentation of fvwm95 \
programs."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "xclass-0.9.2-188.6.aarch64.rpm"
RPM_HASH = "897bf709368f5a171472ce8ec5dd3a5c6813c24bbdea3a6084b112fddeb0acb6fcae2a9480a34b815db5ab9e6b7747d0e7a1d422156c40530d259d49433b937e"

RPROVIDES:${PN} += "config(xclass) \
xclass \
xclass(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
