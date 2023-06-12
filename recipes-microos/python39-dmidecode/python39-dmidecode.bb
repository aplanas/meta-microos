SUMMARY = "Python module to access DMI data"
DESCRIPTION = "python-dmidecode is a python extension module that uses the code-base \
of the 'dmidecode' utility, and presents the data as python data \
structures or as XML data using libxml2."
LICENSE = "GPL-2.0-only"

PV = "3.12.3"

RPM_NAME = "python39-dmidecode-3.12.3-4.1.aarch64.rpm"
RPM_HASH = "29b4fa5b6da0866a7071c3c4a0e3657bbc9f97407e3c1272a1fbee5ba9197b4d0d87b031afce520c98328d4d6dea6f0dc974aa4e6588031805038b904a6dc976"

RPROVIDES:${PN} += "python3.9dist(python-dmidecode) \
python39-dmidecode \
python39-dmidecode(aarch-64) \
python3dist(python-dmidecode)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxml2mod.cpython-39-aarch64-linux-gnu.so()(64bit) \
python(abi) \
python39 \
update-alternatives"

inherit rpm
