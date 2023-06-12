SUMMARY = "A CFFI binding for Hoedown, a markdown parsing library"
DESCRIPTION = "A CFFI binding for Hoedown_ (version 3), a markdown parsing library."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-misaka-2.1.1-2.17.aarch64.rpm"
RPM_HASH = "169a75f042dee04aab45f825a2b315160a6bbd2fc45e0dd8746f7f09dc9b745eecce9ce0f23283a0157eafa6a7e447fe3ea3d6a8ad08dcba3ff64d855178e878"

RPROVIDES:${PN} += "python3.9dist(misaka) \
python39-misaka \
python39-misaka(aarch-64) \
python3dist(misaka)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-cffi \
update-alternatives"

inherit rpm
