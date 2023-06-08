SUMMARY = "Python3 bindings for libsoc"
DESCRIPTION = "libsoc is a C library to interface with common peripherals found in System \
on Chips (SoC) through generic Linux Kernel interfaces. \
 \
This package contains python3 bindings for libsoc."
LICENSE = "LGPL-2.1-only"

PV = "0.8.2"

RPM_NAME = "python3-libsoc-0.8.2-3.13.aarch64.rpm"
RPM_HASH = "fa8819ddacbf05a9097e7c9e1aafbbfa21bcf9715a981c06cacbc5698043386c5c3b69e545da518aea2de067acbdead5f764b8fb46abdf29bffc2952c399389f"

RPROVIDES:${PN} += "python3-libsoc python3-libsoc(aarch-64)"
RDEPENDS:${PN} += "libsoc2 python(abi)"

inherit rpm
