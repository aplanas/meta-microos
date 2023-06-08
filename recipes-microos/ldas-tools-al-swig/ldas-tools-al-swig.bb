SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "ldas-tools-al-swig-2.6.7-3.7.aarch64.rpm"
RPM_HASH = "63c160c234338ff64c47588ea58fd2b0885f4e8a1082087972acd35b04bfb865c53e38b460d230553ad28ced5aabb38aa8628387818e3ab12eed7e3ddddbf45b"

RPROVIDES:${PN} += "ldas-tools-al-swig ldas-tools-al-swig(aarch-64) python2-ldas-tools-al-swig"
RDEPENDS:${PN} += ""

inherit rpm
