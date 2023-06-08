SUMMARY = "Python module to patch python built-in objects"
DESCRIPTION = "This project allows you to patch built-in objects, declared in C through \
python."
LICENSE = "GPL-3.0-only | MIT"

PV = "0.1.3"

RPM_NAME = "python39-forbiddenfruit-0.1.3-2.17.aarch64.rpm"
RPM_HASH = "bbb44785af52169ca5a64b883c8615d17499defd7f65b67a0b155e3858b70c9370a8c0571fc03356bdfc0f44f0da29c93b4493b140c3316c71f5c207dee54cce"

RPROVIDES:${PN} += "python3.9dist(forbiddenfruit) python39-forbiddenfruit python39-forbiddenfruit(aarch-64) python3dist(forbiddenfruit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
