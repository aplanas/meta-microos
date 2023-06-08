SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.2.2"

RPM_NAME = "python39-lhafile-0.2.2-1.24.aarch64.rpm"
RPM_HASH = "f8e569564f1eecea339df38109f027d34bcc0f8ff895869ddd88420c954123482800fe0887e4b45d80aba40b4c049afd19c8ed17000c6d9e20975a9821f98a16"

RPROVIDES:${PN} += "python3.9dist(lhafile) python39-lhafile python39-lhafile(aarch-64) python3dist(lhafile)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
