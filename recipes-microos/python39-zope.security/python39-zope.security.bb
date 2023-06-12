SUMMARY = "Zope Security Framework"
DESCRIPTION = "The Security framework provides a generic mechanism to implement security \
policies on Python objects."
LICENSE = "ZPL-2.1"

PV = "6.1"

RPM_NAME = "python39-zope.security-6.1-1.1.aarch64.rpm"
RPM_HASH = "d18ae21d7d95a30bc3361bd4d84504f33b0b717a0b0bbddf75eab8f03f86491cf0f8f7dd16f216ef0a9b770eaf02b0958781ef60d5f8eafdf646d4476793312d"

RPROVIDES:${PN} += "python3.9dist(zope.security) \
python39-zope.security \
python39-zope.security(aarch-64) \
python3dist(zope.security)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39-pytz \
python39-zope.component \
python39-zope.configuration \
python39-zope.i18nmessageid \
python39-zope.interface \
python39-zope.location \
python39-zope.proxy \
python39-zope.schema"

inherit rpm
