SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.5.1"

RPM_NAME = "python310-hunter-3.5.1-1.5.aarch64.rpm"
RPM_HASH = "66b112b6c30a7379e03633235a2392b04f3049127345180793e0cede3d3293e8d695f219dd2ffc0d1c0e0bf940786d62800faf331ff2d96e45804d4f2f9685c6"

RPROVIDES:${PN} += "python3-hunter \
python3.10dist(hunter) \
python310-hunter \
python310-hunter(aarch-64) \
python3dist(hunter)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
update-alternatives"

inherit rpm
