SUMMARY = "Python binding for ptrace"
DESCRIPTION = "python-ptrace is a debugger using ptrace written in Python."
LICENSE = "GPL-2.0-only"

PV = "0.9.7"

RPM_NAME = "python39-python-ptrace-0.9.7-1.14.aarch64.rpm"
RPM_HASH = "2791051f2c662fc222a0f1ce95f8dfe4b3fca7719fa7600ca028fc225e27e4cfe8da7838d7c827355d4a48cc5b2b6c964053955f5878593e941abc6f21cfc434"

RPROVIDES:${PN} += "python3.9dist(cptrace) python3.9dist(python-ptrace) python39-python-ptrace python39-python-ptrace(aarch-64) python3dist(cptrace) python3dist(python-ptrace)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) update-alternatives"

inherit rpm
