SUMMARY = "JavaScript interpreter for Python"
DESCRIPTION = "DukPy is a javascript interpreter for Python built on top of \
duktape engine. \
It comes with a bunch of common transpilers built-in for convenience: \
 \
    - CoffeeScript \
    - BabelJS \
    - TypeScript \
    - JSX \
    - LESS"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-dukpy-0.3.0-1.5.aarch64.rpm"
RPM_HASH = "58e41381dbef44cd910baf109c048c9651132c6aa6afcac24c5e967c2c03124af638b953fc932a3dc2ba1194bc24ddd1280aee7cda3e6787b69c656b2c379153"

RPROVIDES:${PN} += "python3.11dist(dukpy) python311-dukpy python311-dukpy(aarch-64) python3dist(dukpy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) update-alternatives"

inherit rpm
