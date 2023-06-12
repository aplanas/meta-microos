SUMMARY = "The GNU MP Library"
DESCRIPTION = "GMP is a free library for arbitrary precision arithmetic, operating on signed integers, \
rational numbers, and floating point numbers."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "6.1.1"

RPM_NAME = "mingw64-libgmp10-6.1.1-3.11.noarch.rpm"
RPM_HASH = "24279d79802fe5d764555f4f04f7d25ca13584967394db1eb08b4cd27639a5d2c5c7cbddaa0edbe8d5ef45ceb536079984126f22dd79b580e431e368654f0f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libgmp-10.dll) \
mingw64-libgmp \
mingw64-libgmp10"
RDEPENDS:${PN} += ""

inherit rpm
