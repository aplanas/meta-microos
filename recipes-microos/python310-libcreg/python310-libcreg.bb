SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python310-libcreg-20210625-5.7.aarch64.rpm"
RPM_HASH = "e7c6adce763a392783ef5f6c566f0248b19043852ad1034de8dd73364cf55ceebee948d45a846eae02f6e34e32759db9e6494c7a3428212623303b224e4361e1"

RPROVIDES:${PN} += "python3-libcreg \
python310-libcreg \
python310-libcreg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libcreg.so.1()(64bit) \
libcreg.so.1(V_20210625)(64bit) \
python(abi)"

inherit rpm
