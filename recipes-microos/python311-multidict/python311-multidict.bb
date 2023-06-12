SUMMARY = "Multidict implementation"
DESCRIPTION = "Multidicts are useful for working with HTTP headers, URL query \
arguments, etc. \
 \
The code was extracted from the aiohttp library."
LICENSE = "Apache-2.0"

PV = "6.0.4"

RPM_NAME = "python311-multidict-6.0.4-2.1.aarch64.rpm"
RPM_HASH = "9a863b184212bcc1c9aaa14de71a2d747663edb6fecd124897c6508ac295d19309be24c697a51b5faad4f3a523384e53528ea05dd2d383d823a365336d597e81"

RPROVIDES:${PN} += "python3.11dist(multidict) \
python311-multidict \
python311-multidict(aarch-64) \
python3dist(multidict)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
