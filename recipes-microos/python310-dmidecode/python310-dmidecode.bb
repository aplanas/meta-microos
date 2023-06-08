SUMMARY = "Python module to access DMI data"
DESCRIPTION = "python-dmidecode is a python extension module that uses the code-base \
of the 'dmidecode' utility, and presents the data as python data \
structures or as XML data using libxml2."
LICENSE = "GPL-2.0-only"

PV = "3.12.3"

RPM_NAME = "python310-dmidecode-3.12.3-4.1.aarch64.rpm"
RPM_HASH = "b3a16811360765526a76e599398cc091a13649e4437604d8276d8cc6b657e992c4e62733bacb3bba11bd2c871ff4ff671f8126e1eef3a60373a264c7405a1f75"

RPROVIDES:${PN} += "python3-dmidecode python3.10dist(python-dmidecode) python310-dmidecode python310-dmidecode(aarch-64) python3dist(python-dmidecode)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.2)(64bit) libxml2mod.cpython-310-aarch64-linux-gnu.so()(64bit) python(abi) python310 update-alternatives"

inherit rpm
