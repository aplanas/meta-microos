SUMMARY = "Python(ic) interface to the linux prctl syscall"
DESCRIPTION = "The linux prctl function allows you to control specific characteristics of a \
process' behaviour. Usage of the function is fairly messy though, due to \
limitations in C and linux. This module provides a nice non-messy python(ic) \
interface. \
 \
Besides prctl, this library also wraps libcap for complete capability handling \
and allows you to set the process name as seen in ps and top."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "python39-python-prctl-1.8.1-2.4.aarch64.rpm"
RPM_HASH = "6624886e2e767f8c946effc130472da1476f8a5aa61fdc991db7dd9440c094ca072a33d625032703fc92a210c458778d2a60346a776a350a3c3ba4a37b3f5ddb"

RPROVIDES:${PN} += "python3.9dist(python-prctl) python39-python-prctl python39-python-prctl(aarch-64) python3dist(python-prctl)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcap.so.2()(64bit) python(abi)"

inherit rpm
