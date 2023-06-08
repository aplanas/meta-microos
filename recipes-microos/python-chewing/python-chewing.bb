SUMMARY = "Python bindings for libchewing"
DESCRIPTION = "This package contains python bindings for chewing, an intelligent phonetic \
input method library for traditional Chinese. \
 \
Only input method framework written in python (like very old versions of ibus) \
or developers will need it."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1+git20200627.452f622"

RPM_NAME = "python-chewing-0.5.1+git20200627.452f622-1.9.aarch64.rpm"
RPM_HASH = "75273746633540a3c9c9fdeff80c256e353f30ef3a6e7c94ac4dae3da21048ce13a0fe33ffd639452339429c22eea514c9abf3e5b4680e0980bf0f248ac03137"

RPROVIDES:${PN} += "python-chewing python-chewing(aarch-64)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
