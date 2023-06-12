SUMMARY = "Python module to access DMI data"
DESCRIPTION = "python-dmidecode is a python extension module that uses the code-base \
of the 'dmidecode' utility, and presents the data as python data \
structures or as XML data using libxml2."
LICENSE = "GPL-2.0-only"

PV = "3.12.3"

RPM_NAME = "python311-dmidecode-3.12.3-4.1.aarch64.rpm"
RPM_HASH = "cb2e7f4ccecc2fb009597b90a103537fbf11cbfceae891fdcdb4507d8c69062e00ac596ff5a2a208649ab8fa9717edc4f4fb50a90f0830531a7b9da71cfebae0"

RPROVIDES:${PN} += "python3.11dist(python-dmidecode) \
python311-dmidecode \
python311-dmidecode(aarch-64) \
python3dist(python-dmidecode)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxml2mod.cpython-311-aarch64-linux-gnu.so()(64bit) \
python(abi) \
python311 \
update-alternatives"

inherit rpm
