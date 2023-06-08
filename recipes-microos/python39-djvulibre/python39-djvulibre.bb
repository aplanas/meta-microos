SUMMARY = "Python Support for the DjVu Image Format"
DESCRIPTION = "python-djvulibre is a set of Python bindings for the DjVuLibre library, \
an open source implementation of DjVu."
LICENSE = "GPL-2.0-only"

PV = "0.8.6"

RPM_NAME = "python39-djvulibre-0.8.6-2.12.aarch64.rpm"
RPM_HASH = "00fb121b6aeb4f24b35567cf741c373f231ec5dec384acee0b4ab4e60533f335b1cebe8c0c10e76d31bc3da251b764da2f55cb9bdf6c2ae624eb8465c979ea85"

RPROVIDES:${PN} += "python3.9dist(python-djvulibre) python39-djvulibre python39-djvulibre(aarch-64) python3dist(python-djvulibre)"
RDEPENDS:${PN} += "djvulibre ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdjvulibre.so.21()(64bit) python(abi)"

inherit rpm
