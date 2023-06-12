SUMMARY = "LSC Algorithm Frame Library for gravitational wave data analysis"
DESCRIPTION = "The LSC Algorithm Frame Library for gravitational wave data analysis."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.1"

RPM_NAME = "python310-lalframe-2.0.1-1.2.aarch64.rpm"
RPM_HASH = "ceeba5d175b2f88bdd68c23d14a3d863136c49857b0b1f186717cb61837029ea543f9efcbe623f2186b14a57707145aee303bba74e271331337e8cf4bece3c93"

RPROVIDES:${PN} += "python3-lalframe \
python310-lalframe \
python310-lalframe(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblal.so.20()(64bit) \
liblalframe.so.13()(64bit) \
liblalsupport.so.14()(64bit) \
python(abi) \
python310-lal \
python310-numpy"

inherit rpm
