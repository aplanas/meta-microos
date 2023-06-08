SUMMARY = "Extensible JSON encoder/decoder for Python"
DESCRIPTION = "simplejson is an extensible JSON encoder and decoder for Python 2.5+. It is \
pure Python code with no dependencies, but includes an optional C extension for \
a speed boost."
LICENSE = "AFL-2.1 | MIT"

PV = "3.19.1"

RPM_NAME = "python311-simplejson-3.19.1-1.1.aarch64.rpm"
RPM_HASH = "1379e41f90eadf48c32a46b1c48f0966333fc9e2652898fce5c9bd9a4151df982f634f66ddfe1af907eb168bc54e954b0bb8a254c79d815fcca183717e7bbb64"

RPROVIDES:${PN} += "python3.11dist(simplejson) python311-simplejson python311-simplejson(aarch-64) python3dist(simplejson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
