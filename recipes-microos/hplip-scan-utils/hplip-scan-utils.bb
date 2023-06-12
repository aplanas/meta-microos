SUMMARY = "HPLIP scanning frontends hp-scan and hp-uiscan"
DESCRIPTION = "This package provides the 'hp-scan' and 'hp-uiscan' frontend utilities. These \
utilities are alternatives to the SANE frontends 'xsane' and 'scanimage'. They \
expose some advanced features of certain HP scanner models."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.22.10"

RPM_NAME = "hplip-scan-utils-3.22.10-2.1.aarch64.rpm"
RPM_HASH = "0fc7fe8eec4f05e0a3a57b241c790bfb04801483bba985b04744f95c186d4aa96732712b02171c6532f91546971430bde4162edfca5c8710c726a6a6dd6a9d02"

RPROVIDES:${PN} += "application() \
application(hp-uiscan.desktop) \
hplip-scan \
hplip-scan-utils \
hplip-scan-utils(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
hplip \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsane.so.1()(64bit) \
python(abi) \
python3-Pillow \
python3-scikit-image"

inherit rpm
