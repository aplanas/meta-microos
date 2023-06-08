SUMMARY = "Python bindings for iptables"
DESCRIPTION = "Python-iptables is a Python project that provides bindings to the iptables C libraries in Linux. \
Interoperability with iptables is achieved using the iptables C libraries (libiptc, libxtables, \
and iptables extensions), not calling the iptables executable and parsing its output as most other \
iptables wrapper libraries do; this makes python-iptables faster and not prone to parsing errors, \
at the same time leveraging all available iptables match and target extensions without further work."
LICENSE = "Apache-2.0"

PV = "0.13.0"

RPM_NAME = "python310-iptables-0.13.0-1.23.aarch64.rpm"
RPM_HASH = "970fcba3a7c7d72434794f9be4cde39a77e6da30b91a39b71b35a3adde03bf2d597feb505bf87d077a40870fa128b959a42457c7f0f07b3902bc5dea22622f84"

RPROVIDES:${PN} += "libxtwrapper.cpython-310-aarch64-linux-gnu.so()(64bit) python3-iptables python3.10dist(python-iptables) python310-iptables python310-iptables(aarch-64) python3dist(python-iptables)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
