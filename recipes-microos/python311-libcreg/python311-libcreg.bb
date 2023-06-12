SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "python311-libcreg-20210625-5.7.aarch64.rpm"
RPM_HASH = "3cfc36e983ace4a4b426f76206d0aaecbb464467673c012acdf9a6db7cc99088a2b213e79ff903dbdfc6d79dcb35927a18857a87995c6d96b38d9b37ea3c3074"

RPROVIDES:${PN} += "python311-libcreg \
python311-libcreg(aarch-64)"
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
