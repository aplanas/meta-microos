SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python39-libcreg-20210625-5.7.aarch64.rpm"
RPM_HASH = "5846109ef5416d2ca7183a36612be3bea5bb3cd3ad20a438862274669b9b9b5d2fe4c8a523a36beae0fb5b53d40d16b730d6a862c28b2c97bb5a549e2d5a1376"

RPROVIDES:${PN} += "python39-libcreg python39-libcreg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcreg.so.1()(64bit) libcreg.so.1(V_20210625)(64bit) python(abi)"

inherit rpm
