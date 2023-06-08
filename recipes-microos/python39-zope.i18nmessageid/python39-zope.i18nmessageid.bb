SUMMARY = "Zope Location"
DESCRIPTION = "In Zope3, i18nmessageid are special objects that has a structural i18nmessageid."
LICENSE = "ZPL-2.1"

PV = "6.0.1"

RPM_NAME = "python39-zope.i18nmessageid-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "a324b055f6461c576a7d66a4815d1afbcd22b34bf2517f4816086b5ab11a13c4d928c4a39bbac10604965a1644f86084b4b7a56a886b81e8cb20ab1dbfdb9687"

RPROVIDES:${PN} += "python3.9dist(zope.i18nmessageid) python39-zope.i18nmessageid python39-zope.i18nmessageid(aarch-64) python3dist(zope.i18nmessageid)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
