SUMMARY = "Python SDK for oVirt Engine API"
DESCRIPTION = "Python SDK for oVirt Engine API"
LICENSE = "Apache-2.0"

PV = "4.4.9"

RPM_NAME = "python39-ovirt-engine-sdk-4.4.9-1.13.aarch64.rpm"
RPM_HASH = "e9f7840284a1f0c452188638b387a9fc39519117a2af1f59838f1878fc57c910b649c1a6a721bfdad5adccf00f53fc0fabebe33669cbefbea6cb9a8f1949117c"

RPROVIDES:${PN} += "python3.9dist(ovirt-engine-sdk-python) \
python39-ovirt-engine-sdk \
python39-ovirt-engine-sdk(aarch-64) \
python3dist(ovirt-engine-sdk-python)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
python(abi) \
python39-pycurl \
python39-six"

inherit rpm
